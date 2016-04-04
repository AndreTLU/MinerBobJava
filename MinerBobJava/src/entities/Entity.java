package entities;

import location.Locations;

public abstract class Entity {
	private int _id;
	private static int _nextValidId;
	private Locations.LocationType _location;
	
	private void SetID(){
		_id = _nextValidId;
	}
	
	public Entity(){
		SetID();
	}
	
	abstract public void Update();

	public Locations.LocationType get_location() {
		return _location;
	}

	public void set_location(Locations.LocationType _location) {
		this._location = _location;
	}
}
