package states;

import entities.Entity;

public class EnterHome extends State {
	private static EnterHome instance = null;
	private EnterHome(){}
	
	public 	static EnterHome Instance(){
		if(instance == null) instance = new EnterHome();
		return instance;
	}
	@Override
	public void Enter(Entity entity) {
		System.out.println("Going home");
		
	}
	@Override
	public void Execute(Entity entity) {
		System.out.println("I am home");
		
	}
	@Override
	public void Exit(Entity entity) {
		System.out.println("Leaving home");
		
	}
}
