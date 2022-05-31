package designpatterns.state;

public class Published implements State {

	private OnlineCourse onlineCourse;

	public Published(OnlineCourse onlineCourse) {
		this.onlineCourse = onlineCourse;
	}

	@Override
	public void addStudent(Student student) {
		this.onlineCourse.getStudents().add(student);
	}

	@Override
	public void addReview(String review, Student student) {
		this.onlineCourse.getReviews().add(review);
	}

}
