package designpatterns.composite;

public class Item implements Component {
	private String name;
	private int price;

	@Override
	public int getPrice() {
		return price;
	}

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

}
