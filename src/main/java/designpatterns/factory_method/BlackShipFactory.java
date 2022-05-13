package designpatterns.factory_method;

public class BlackShipFactory implements ShipFactory {

	@Override
	public Ship createShip() {
		
		return new BlackShip();
	}

}
