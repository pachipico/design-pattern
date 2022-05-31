package designpatterns.state;

public class Client {
	public static void main(String[] args) {
		Student student = new Student("jhs");
		OnlineCourse onlineCourse = new OnlineCourse();
		
		Student newStudent = new Student("new student");
		
		onlineCourse.addStudent(student);
		newStudent.addPrivate(onlineCourse);
		
		onlineCourse.changeState(new Private(onlineCourse));
		
		onlineCourse.addStudent(newStudent);
		
		onlineCourse.addReview("sdfsd", student);
		
		
		System.out.println(onlineCourse.getState());
		System.out.println(onlineCourse.getStudents());
		System.out.println(onlineCourse.getReviews());
	}
}
