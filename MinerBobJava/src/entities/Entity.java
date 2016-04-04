package entities;

public abstract class Entity {
	private int _id;
	private static int _nextValidId;
	
	private void SetID(){
		_id = _nextValidId;
	}
	
	public Entity(){
		SetID();
	}
	
	abstract public void Update();
}
