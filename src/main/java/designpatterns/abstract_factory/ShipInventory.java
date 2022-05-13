package designpatterns.abstract_factory;

import designpatterns.factory_method.Ship;
import designpatterns.factory_method.ShipFactory;

public class ShipInventory {

	public static void main(String[] args) {
		ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsProFactory());
		
		Ship ship = shipFactory.createShip();
		
		System.out.println(ship);

	}

}
