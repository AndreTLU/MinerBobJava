package states;

import entities.Entity;
import entities.Miner;

public abstract class State {
	public State(){
		
	}
	
	abstract public void Enter(Miner entity);
	abstract public void Execute(Miner entity);
	abstract public void Exit(Miner entity);
}
