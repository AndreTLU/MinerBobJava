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
	
	Locations.LocationType _location;
	
	public Miner(){
		_oreCarried = 0;
		_oreStored = 0;
		_oreCounter = 0;
		_thirst = 0;
		_fatigue = 0;
		_currentState = EnterHome.Instance();
		_location = Locations.LocationType.HOME;
	}
	
	public void Update(){
		_thirst++;
		_currentState.Execute(this);
	}
}
