package designpatterns.abstract_factory;

import designpatterns.factory_method.Ship;
import designpatterns.factory_method.ShipFactory;
import designpatterns.factory_method.WhiteShip;

public class WhiteShipFactory implements ShipFactory {
	
	private ShipPartsFactory shipPartsFactory;
	
	public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
		this.shipPartsFactory = shipPartsFactory;
	}

	@Override
	public Ship createShip() {
		
		Ship ship = new WhiteShip();
		ship.setAnchor(shipPartsFactory.createAnchor());
		ship.setWheel(shipPartsFactory.createWheel());
		return ship;
	}

}
