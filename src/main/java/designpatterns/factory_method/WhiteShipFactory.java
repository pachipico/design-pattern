package designpatterns.factory_method;

public class WhiteShipFactory implements ShipFactory {

	@Override
	public Ship createShip() {
		
		return new WhiteShip();
	}

}
