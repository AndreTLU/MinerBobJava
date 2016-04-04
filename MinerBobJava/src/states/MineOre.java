package states;

import entities.Entity;
import entities.Miner;
import location.Locations.LocationType;

public class MineOre extends State {

	private static MineOre instance = null;
	private MineOre() {
		// TODO Auto-generated constructor stub
	}
	public static MineOre Instance(){
		if(instance == null) instance = new MineOre();
		return instance;
		
	}
	
	@Override
	public void Enter(Miner entity) {
		if(entity.get_location() != LocationType.MINE) 
			entity.set_location(LocationType.MINE);
		System.out.println("Entering mines");
		
		
	}

	@Override
	public void Execute(Miner entity) {
		entity.AddOre(1);
		System.out.println("Getting some good ore!");
		
		if(entity.PocketsFull()) entity.ChangeState(BankOre.Instance());
		
	}

	@Override
	public void Exit(Miner entity) {
		System.out.println("Leaving the mine");
		
	}

}
