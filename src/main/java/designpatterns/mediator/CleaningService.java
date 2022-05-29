package designpatterns.mediator;

public class CleaningService {
	public CleaningService() {
	}
	
	public void getTower(int id, int numberOfTower) {
		System.out.println(id + " 손님, "+numberOfTower+" 개의 타월을 준비했습니다.");
	}
	
	public void clean(Restaurant restoraunt) {
		System.out.println(restoraunt + " 청소 완료");
	}
}
