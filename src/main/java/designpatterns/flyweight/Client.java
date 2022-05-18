package designpatterns.flyweight;

public class Client {

	public static void main(String[] args) {
		FontFactory fontFactory = new FontFactory();
		Font font = fontFactory.getFont("Nanum:12");
		Character c1 = new Character('h', "white", font);
		Character c2 = new Character('e', "white", font);
		Character c3 = new Character('l', "white", font);
		Character c4 = new Character('l', "white", font);
		Character c5 = new Character('o', "white", font);
	}
}
