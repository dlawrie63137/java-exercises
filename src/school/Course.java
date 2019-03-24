package school;

import java.util.ArrayList;


public class Course {

    private final int courseId;
    private final int courseCredits;
    private String courseInstructor;
    private Student student;
    private ArrayList<Student> studentRoster;


    //Create Course object with instructor and a Student object
    public Course(int courseId, int courseCredits, String courseInstructor, Student student) {

        this.courseId = courseId;
        this.courseCredits = courseCredits;
        this.courseInstructor = courseInstructor;
        this.student = student;
        this.studentRoster = new ArrayList<>();
        this.studentRoster.add(student);

    }

    //create Course object and add a Student object later
    public Course(int courseId, int courseCredits, String courseInstructor) {

        this.courseId = courseId;
        this.courseCredits = courseCredits;
        this.courseInstructor = courseInstructor;
        this.studentRoster = new ArrayList<>();

    }

    //create Course object and add an instructor and a Student object later
    public Course(int courseId, int courseCredits) {

        this.courseId = courseId;
        this.courseCredits = courseCredits;

    }


    //getters and setters
    public int getCourseId() {

        return courseId;
    }


    public int getCourseCredits() {

        return courseCredits;
    }


    public String getCourseInstructor() {

        return courseInstructor;
    }

    public void setCourseInstructor(String aCourseInstructor) {

        courseInstructor = aCourseInstructor;
    }

    public ArrayList<Student> getStudentRoster() {

        return studentRoster;
    }

    public void setStudentRoster(Student student) {

        studentRoster.add(student);
    }

    //override default toString method
    public String toString() {
        return courseInstructor + " (CourseId: " + courseId + ", Credits: " + courseCredits + ")";
    }

    // override default equals method
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != getClass()) {
            return false;
        }

        Course theCourse = (Course) o;
        return theCourse.getCourseId() == getCourseId();
    }
}
