package designpatterns.state;

public class Draft implements State {

	private OnlineCourse onlineCourse;

	public Draft(OnlineCourse onlineCourse) {
		this.onlineCourse = onlineCourse;
	}

	@Override
	public void addStudent(Student student) {
		onlineCourse.getStudents().add(student);
		if(this.onlineCourse.getStudents().size() > 1) {
			this.onlineCourse.changeState(new Private(this.onlineCourse));
		}
	}


	@Override
	public void addReview(String review, Student student) {
		throw new UnsupportedOperationException("드래프트 상태의 강좌에는 리뷰를 작성할 수 없습니다.");
	}



}
