package designpatterns.mediator;

public class Guest {
	
	private FrontDesk frontDesk = new FrontDesk();
	
	private Integer id;
	
	public void dinner() {
		frontDesk.reservation(this);
	}
	
	public void getTower(int numberOfTower) {
		frontDesk.getTower(this, numberOfTower);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
