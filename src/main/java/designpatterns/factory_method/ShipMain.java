package designpatterns.factory_method;

public class ShipMain {

	public static void main(String[] args) {
		
		ShipMain shipMain = new ShipMain();
		shipMain.print(new WhiteShipFactory(), "white", "de@de.com");
		shipMain.print(new BlackShipFactory(), "black", "e@d.com");
	}

	private void print(ShipFactory shipFactory, String name, String email) {
		Ship ship = shipFactory.orderShip(name, email);
		System.out.println(ship);
	}

}
  