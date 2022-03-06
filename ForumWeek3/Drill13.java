package ForumWeek3;

import java.util.Scanner;
import java.lang.Math;

public class Drill13 {
    public static void main(String[] args){
        System.out.println("Hello. I shall return the value(s) of x,"+"\n"+"from the polynomial template (ax^2 + bx + c)"+"\n"+"----------------------------------------------");
        Scanner varInput = new Scanner(System.in);//new scanner named varInput

        //user inputs
        System.out.print("Enter coefficient a to complete ax^2 : ");
        double a = varInput.nextDouble(); //i initially use ints for the data type bcs its rare to have a decimal number as a coefficient, but since its still possible, i changed it to double
        while(a == 0){ //the quadratic formula has the rule where a cannot be equal to 0 so if it is equal to 0, it will ask the user for a valid input.
            System.out.print("Invalid coefficient, a cannot be 0! Please reinput a : ");
            double reinputA= varInput.nextDouble();
            a = reinputA;
        }
        System.out.print("Enter coefficient b to complete bx : ");
        double b = varInput.nextDouble();
        System.out.print("Enter coefficient c : ");
        double c = varInput.nextDouble();
        System.out.println("----------------------------------------------");

        //formula of discriminant (D = b^2 - 4ac)
        double D = (Math.pow(b,2) - (4*a*c));

        //to determine the number of solutions according to the discriminant value
        if(D > 0){ //D>0 ensures that there are 2 real solutions
            double x1 = ((-b+Math.pow(D,0.5))/(2*a)); //finding the x1 value 
            double x2 = ((-b-Math.pow(D,0.5))/(2*a)); //finding the x2 value 
            System.out.println("Found 2 x values! x1 = " + String.format("%.2f", x1) +" and x2 = " + String.format("%.2f", x2));

        } else if(D == 0) {//D=0 means that there is 1 real solution
            double x = (-b/2*a); //finding the x value 
            System.out.println("Found 1 x value! x = " + String.format("%.2f", x));

        } else if (D < 0) { //D<0 means that there are only imaginary roots/solution
            System.out.println("This equation resulted in imaginary roots. No real solution found.");
        }   
        
        varInput.close(); //closing the scanner
    }
}   