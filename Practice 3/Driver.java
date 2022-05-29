public class Driver {
    public static void main(String[] args) {
        // Person p1 = new Person("Jocelin", "Inazuma");

        // System.out.println(p1.toString());

        // Student s1 = new Student("Kimberly", "Eorzea");

        // System.out.println(s1.toString());
        // s1.addCourseGrade("Maths", 90);
        // s1.addCourseGrade("OOP", 99);
        // s1.printGrades();
        // System.out.println("Average is " + s1.getAverageGrade());

        Teacher teacher1 = new Teacher("Jude", "Sesame Street");
        System.out.println(teacher1.toString());
        teacher1.addCourse("Math");
        teacher1.addCourse("Geography");
        teacher1.addCourse("Biology");
        teacher1.removeCourse("Science");
        teacher1.removeCourse("Math");
        System.out.println(teacher1.getNumCourses());
        teacher1.printCourses();
    }
}
