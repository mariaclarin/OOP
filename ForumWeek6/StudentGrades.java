package ForumWeek6;
import java.util.Arrays;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args){
        //creating a new scanner to take user inputs called valInput
        Scanner valInput = new Scanner(System.in);
        //an int variable to store the inputs
        int numStudents;
        // an array named grades
        int[] grades;
        
        //takes input of the number of students that are going to be graded
        System.out.print("Enter the number of students : ");
        numStudents = valInput.nextInt();
        
        //declines input if the number of items is 0 or a negative value
        while (numStudents <= 0){
            System.out.println("Invalid input (Minimal Input is 0).");
            System.out.print("Enter the number of items : ");
            numStudents = valInput.nextInt();
            continue;
        } 

        //the array grades takes the value of numStudents as the size of array
        grades = new int[numStudents];

        //for the number of students, this for loop will take inputs of individual student grades.
        for (int i = 0; i < grades.length; i++){
            System.out.print("Enter the grade for student " + (i+1) + " : ");
            grades[i] = valInput.nextInt();
        }

        //sorting the grades so we have the array sorted from the minimum value to the maximum value
        Arrays.sort(grades);

        //formula to find the average from the array
        int sum = 0;
        for (int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        double average = sum / grades.length;

        //printing the output
        System.out.println("The average is : " + String.format("%.2f",average)); 
        System.out.println("The minimum is : " + grades[0]); 
        System.out.println("The maximum is : " + grades[grades.length-1]); 
        
        valInput.close();
    }
}
