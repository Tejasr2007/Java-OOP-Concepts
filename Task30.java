
class Course {
    String courseName;
    int duration;
    double fee;
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: ₹" + fee);
    }
}
public class Task30 {
    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 10000);
        Course c2 = new Course("Python", 4, 8000);
        c1.displayCourse();
        c2.displayCourse();
    }
}

