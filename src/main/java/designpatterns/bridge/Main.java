package designpatterns.bridge;

public class Main {

	public static void main(String[] args) {
		Champion ahri = new Ahri(new KDA());
		ahri.skillQ();

	}

}
