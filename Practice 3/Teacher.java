import java.util.ArrayList;

public class Teacher extends Person {
    private int numCourses;
    private ArrayList<String> courses = new ArrayList<>();

    public Teacher(String name, String address) {
        super(name,address); 
    }

    @Override
    public String toString() {
        return "Teacher: " + super.getName() + "\n" + "Address: " + super.getAddress();
    }

    public boolean addCourse(String course){
        if(courses.contains(course)){
            System.out.println("Course already exist.");
            return false;
        }
        else{
            this.courses.add(course);
            this.numCourses++;
            System.out.println("Course added.");
            return true;
        }
    }

    public boolean removeCourse(String course){
        if(courses.contains(course)){
            this.courses.remove(course);
            this.numCourses--;
            System.out.println("Course removed.");
            return true;
        }
        else{
            System.out.println("Course not found.");
            return false;
        }
    }

    public int getNumCourses(){
        return this.numCourses;
    }

    public void printCourses() {
        System.out.println(courses);
    }
}
