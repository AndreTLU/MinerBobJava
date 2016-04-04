package states;

import entities.Entity;
import entities.Miner;
import location.Locations.LocationType;

public class EnterHome extends State {
	private static EnterHome instance = null;
	private EnterHome(){}
	
	public 	static EnterHome Instance(){
		if(instance == null) instance = new EnterHome();
		return instance;
	}
	@Override
	public void Enter(Miner entity) {
		if(entity.get_location() != LocationType.HOME) 
			entity.set_location(LocationType.HOME);
		System.out.println("Going home");
		
	}
	@Override
	public void Execute(Miner entity) {
		
		System.out.println("I am home");
		entity.Rest();
		entity.ChangeState(MineOre.Instance());
		
	}
	@Override
	public void Exit(Miner entity) {
		System.out.println("Leaving home");
		
	}
}
