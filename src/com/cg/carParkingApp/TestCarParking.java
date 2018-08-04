// Test class to perform Car Parking operations 
package com.cg.carParkingApp;

import java.util.HashMap;
import java.util.Map;

public class TestCarParking {

	public static void main(String[] args) {

		// Initialising location objects (generating tokens)
		ParkedCarLocation token1 = new ParkedCarLocation(1, 1);
		ParkedCarLocation token2 = new ParkedCarLocation(1, 2);
		ParkedCarLocation token3 = new ParkedCarLocation(1, 3);
		ParkedCarLocation token4 = new ParkedCarLocation(1, 4);
		ParkedCarLocation token5 = new ParkedCarLocation(2, 1);
		ParkedCarLocation token6 = new ParkedCarLocation(2, 2);
		ParkedCarLocation token7 = new ParkedCarLocation(2, 3);
		ParkedCarLocation token8 = new ParkedCarLocation(2, 4);
		ParkedCarLocation token9 = new ParkedCarLocation(3, 1);
		ParkedCarLocation token10 = new ParkedCarLocation(3, 2);

		// Initialising OwnerDetails objects
		ParkedCarOwnerDetails owner1 = new ParkedCarOwnerDetails("Nitesh", "dzire", "Dl R3458", 458645874, "New Delhi");
		ParkedCarOwnerDetails owner2 = new ParkedCarOwnerDetails("Nitin", "city", "MH 4857", 985648125, "Mumbai");
		ParkedCarOwnerDetails owner3 = new ParkedCarOwnerDetails("Lucky", "zantro", "GJ 4785", 456878125, "Vadodara");

		// Initialising parkedCarOwnerList object
		ParkedCarOwnerList parkedCarOwnerList = new ParkedCarOwnerList();

		parkedCarOwnerList.addNewCar(token1, owner1);
		parkedCarOwnerList.addNewCar(token2, owner2);
		parkedCarOwnerList.addNewCar(token3, owner3);

		parkedCarOwnerList.getParkedCarLocation(token2);

		parkedCarOwnerList.removeCar(token2);

		parkedCarOwnerList.getParkedCarLocation(token2);

	}

}
