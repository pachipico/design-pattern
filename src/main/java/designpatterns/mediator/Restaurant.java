package designpatterns.mediator;

public class Restaurant {
	
	private CleaningService cleaningService;
	
	public Restaurant() {
	}
	
	public void dinner(Integer id) {
		System.out.println(id+" 손님의 저녁이 준비 되었습니다.");
	}
	
	public void clean() {
		cleaningService.clean(this);
	}
}
