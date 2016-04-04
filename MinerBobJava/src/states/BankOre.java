package states;

import entities.Miner;
import location.Locations.LocationType;

public class BankOre extends State {

	private static BankOre instance = null;
	private  BankOre() {
		// TODO Auto-generated constructor stub
	}
	public static BankOre Instance(){
		if(instance == null) instance = new BankOre();
		return instance;
	}
	
	@Override
	public void Enter(Miner entity) {
		if(entity.get_location() != LocationType.BANK) 
			entity.set_location(LocationType.BANK);
		System.out.println("Entering bank");
		
	}

	@Override
	public void Execute(Miner entity) {
		entity.BankOre();
		System.out.println("Banking some ore...");
		if(entity.EnoughOre()) entity.ChangeState(EnterHome.Instance());
		else entity.ChangeToPreviousState();
		
	}

	@Override
	public void Exit(Miner entity) {
		System.out.println("Leavin Bank");
		
	}

}
