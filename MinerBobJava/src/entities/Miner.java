package entities;

import location.Locations;
import states.*;

public class Miner extends Entity {
	
	State _currentState;
	State _previousState;
	
	int _oreCarried;
	int _oreStored;
	int _oreCounter;
	int _thirst;
	int _fatigue;
	
	
	
	public Miner(){
		_oreCarried = 0;
		_oreStored = 0;
		_oreCounter = 0;
		_thirst = 0;
		_fatigue = 0;
		_currentState = EnterHome.Instance();
		set_location(Locations.LocationType.HOME);
	}
	
	public void Update(){
		_thirst++;
		_currentState.Execute(this);
	}
	
	public void IncreaseFatigue(){
		_fatigue++;
	}
	
	public void AddOre(int _value){
		_oreCarried += _value;
	}
	
	public void BankOre(){
		_oreStored += _oreCarried;
		_oreCounter += _oreCarried;
		_oreCarried = 0;
	}
	
	public boolean PocketsFull(){
		if(_oreCarried == 3) return true;
		else return false;
	}
	
	public boolean EnoughOre(){
		if(_oreCounter >= 8) return true;
		else return false;
	}
	
	public void Rest(){
		_thirst = 0;
		_oreCounter = 0;
		_fatigue = 0;
	}
	
	public void ChangeState(State _newState){
		_previousState = _currentState;
		_currentState.Exit(this);
		_currentState = _newState;
		_currentState.Enter(this);
	}
	
	public void ChangeToPreviousState(){
		ChangeState(_previousState);
	}
}
