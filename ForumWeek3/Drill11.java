package ForumWeek3;

import java.util.Scanner;

public class Drill11 {
    public static void main(String[] args){
        System.out.println("Hello! I am a number swapper :D"+"\n"+"---------------------------------");
        Scanner varInput = new Scanner(System.in); //new scanner named varInput

        //user input
        System.out.print("Input the first number (x) : "); 
        int x = varInput.nextInt();
        System.out.print("Input the second number (y) : "); 
        int y = varInput.nextInt();
        int n; //declaring a new var to store x value

        n = x; //extra var to store x value before changing its value
        x = y; //taking y value
        y = n; //taking n value (x value)

        System.out.println("---------------------------------"+"\n"+"hehe i have swapped your numbers, x is now "+ x + " and y is now " + y );
        
        varInput.close(); //closing the scanner
    }
}