package designpatterns.state;

public interface State {
	void addStudent(Student student);
	void addReview(String review, Student student);
}
