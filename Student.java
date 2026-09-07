import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<String> courses;
    private static final int MAX_COURSES = 5;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void registerCourse(String courseName) {
        if (courses.size() >= MAX_COURSES) {
            System.out.println("Cannot register for \"" + courseName + "\". Maximum limit of " + MAX_COURSES + " courses reached for " + name + ".");
        } else {
            courses.add(courseName);
            System.out.println("Successfully registered for course: " + courseName);
        }
    }

    public void displayCourses() {
        System.out.println("\nRegistered Courses for " + name + " (" + courses.size() + "/" + MAX_COURSES + "):");
        if (courses.isEmpty()) {
            System.out.println("No courses registered yet.");
        } else {
            for (int i = 0; i < courses.size(); i++) {
                System.out.println((i + 1) + ". " + courses.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Rohan Kumar");

        student.registerCourse("Data Structures");
        student.registerCourse("Database Management Systems");
        student.registerCourse("Operating Systems");
        student.registerCourse("Computer Networks");
        student.registerCourse("Software Engineering");
        
        // Exceeding 5 courses limit
        student.registerCourse("Artificial Intelligence");

        student.displayCourses();
    }
}
