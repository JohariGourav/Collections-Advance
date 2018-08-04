//class ParkedCarLocation generating a token as object which has location of parked car
package com.cg.carParkingApp;

public class ParkedCarLocation {
	private int floor;
	private int section;

	// Arg Ctor..
	public ParkedCarLocation(int floor, int section) {
		super();
		this.floor = floor;
		this.section = section;
	}

	// toSTRING METHOD
	@Override
	public String toString() {
		return "ParkedCarLocation [floor=" + floor + ", section=" + section + "]";
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

}
