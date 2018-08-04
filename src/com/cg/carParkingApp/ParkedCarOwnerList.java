// class ParkedCarOwnerList with Hash Map
package com.cg.carParkingApp;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ParkedCarOwnerList {

	Map<ParkedCarLocation, ParkedCarOwnerDetails> map = new HashMap<>();

	// method to add car in parking
	public int addNewCar(ParkedCarLocation obj1, ParkedCarOwnerDetails obj2) {
		map.put(obj1, obj2);
		if (map.containsValue(obj2))
			return 1;
		else
			return 0;
	}

	// method to remove car from parking
	public void removeCar(ParkedCarLocation token) {

		map.remove(token);
		System.out.println("Car Removed");
	}

	// method to get parked car location
	public void getParkedCarLocation(ParkedCarLocation token) {

		if (map.containsKey(token)) {
			System.out.println(map.get(token));
			//System.out.println(map.);

		} else
			System.out.println("Parking location is empty");
	}
}
