package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {
	
	private List<Component> components;

	public Bag() {
		components = new ArrayList<>();
	}

	public void add(Item item) {
		this.components.add(item);
	}

	public List<Component> getItems() {
		return components;
	}

	public void setItems(List<Component> components) {
		this.components = components;
	}

	@Override
	public int getPrice() {
		return this.components.stream().mapToInt(Component::getPrice).sum();
	}

}
