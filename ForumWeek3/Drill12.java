package ForumWeek3;

public class Drill12 {
    public static void main(String[] args){
        System.out.println("Squares and Cubes Table (1-10)"+"\n"+"-------------------------------");
        System.out.println("Number" + "\t" + "Square" + "\t" + "Cube"); //using \t to format the output to have equal horizontal spacing

        for (int x = 0; x <= 10; x++) { //for the range of numbers starting from 0 up to 10 
            System.out.println(x + "\t" + x*x + "\t" + x*x*x); //print out the x value, the square of x, and x cube
        }
        System.out.println("-------------------------------");
    }
}