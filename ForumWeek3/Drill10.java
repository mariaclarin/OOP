package ForumWeek3;

import java.util.Scanner;

public class Drill10 {
    public static void main(String[] args){
        System.out.println("Hello I am a mean, variance and standard deviation calculator for 3 variables :D. "+"\n"+"-----------------------------------------------------------------------------------");
        Scanner varInput = new Scanner(System.in); //new scanner named varInput

        //user inputs 
        System.out.print("Input the first number (x1): ");
        float x1 = varInput.nextFloat(); 
        System.out.print("Input the second number (x2): ");
        float x2 = varInput.nextFloat();
        System.out.print("Input the third number (x3): ");
        float x3 = varInput.nextFloat();
        System.out.println("-----------------------------------------------------------------------------------"+"\n"+"Here are the results!");

        //formula of mean, variance, and standard deviation and print formatting
        double mean = (x1+x2+x3)/3;
        double variance = (Math.pow((x1 - mean), 2) + Math.pow((x2 - mean), 2) + Math.pow((x3 - mean), 2)) / 3;
        double standardDeviation = Math.sqrt(Math.pow(variance, 2));
        System.out.println("Mean : " + String.format("%.2f", mean) + "\n" +"Variance : " + String.format("%.2f", variance) + "\n" + "Standard Deviation : " + String.format("%.2f", standardDeviation)+"\n"+"-----------------------------------------------------------------------------------");

        varInput.close(); //closing the scanner
    }
}