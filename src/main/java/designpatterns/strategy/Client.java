package designpatterns.strategy;

public class Client {
	public static void main(String[] args)  {
		BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new Fast());
		blueLightRedLight.blueLight();
		blueLightRedLight.redLight();
		
	}
}
