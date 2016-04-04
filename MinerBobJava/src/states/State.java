package states;

import entities.Entity;

public abstract class State {
	public State(){
		
	}
	
	abstract public void Enter(Entity entity);
	abstract public void Execute(Entity entity);
	abstract public void Exit(Entity entity);
}
