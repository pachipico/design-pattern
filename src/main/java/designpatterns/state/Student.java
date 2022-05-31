package designpatterns.state;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {


    private String name;

    public Student(String name) {
        this.name = name;
    }

    private Set<OnlineCourse> privateCourses = new HashSet<>();

    public boolean isAvailable(OnlineCourse onlineCourse) {
        return privateCourses.contains(onlineCourse);
    }

    public void addPrivate(OnlineCourse onlineCourse) {
        this.privateCourses.add(onlineCourse);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
	
}
