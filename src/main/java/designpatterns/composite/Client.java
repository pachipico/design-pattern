package designpatterns.composite;

public class Client {

	public static void main(String[] args) {
		Item doranBlade = new Item("doran's blade", 450);
		Item healPotion = new Item("heal potion", 50);

		Bag bag = new Bag();
		bag.add(doranBlade);
		bag.add(healPotion);
		Client client = new Client();
		client.printPrice(doranBlade);
		client.printPrice(bag);
	}

	private void printPrice(Component component) {
		System.out.println(component.getPrice());
	}

}
