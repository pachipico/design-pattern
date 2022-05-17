package designpatterns.builder;

import java.time.LocalDate;

public class TourDirector {

	private TourPlanBuilder builder;

	public TourDirector(TourPlanBuilder builder) {
		this.builder = builder;
	}

	public TourPlan pusanTrip() {
		return builder.title("Pusan Trip").nightsAndDays(3, 4).startDate(LocalDate.of(2022, 6, 8)).getPlan();
	}
}
