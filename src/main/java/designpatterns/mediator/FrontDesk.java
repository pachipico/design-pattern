package designpatterns.mediator;

public class FrontDesk {
	private CleaningService cleaningService = new CleaningService();
	private Restaurant restaurant = new Restaurant();
	public void reservation(Guest guest) {
		restaurant.dinner(guest.getId());
	}
	public void getTower(Guest guest, int numberOfTower) {
		cleaningService.getTower(guest.getId(),numberOfTower);
	}
}
