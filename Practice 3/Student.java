import java.util.ArrayList;
public class Student extends Person {
    private int numCourses;
    private ArrayList<String> courses = new ArrayList<>();
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, String address) {
        super(name,address); // // this invokes the constructor of the parent class
    }

    @Override
    public String toString() {
        // // use super keyword to access methods defined in the superclass
        return "Student: " + super.getName() + "\n" + "Address: " + super.getAddress();
    }

    public void addCourseGrade(String course, int grade) {
        this.courses.add(course);
        this.grades.add(grade);
        this.numCourses++;
    }

    public void printGrades() {
        System.out.println(grades);
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int i = 0; i < this.numCourses;i++) {
            sum += grades.get(i).doubleValue();
        }
        return sum / this.numCourses;
    }
}
