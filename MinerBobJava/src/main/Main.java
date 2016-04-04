package main;

import entities.Miner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Miner miner = new Miner();
		
		for(int i= 0; i<10; i++){
			miner.Update();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
