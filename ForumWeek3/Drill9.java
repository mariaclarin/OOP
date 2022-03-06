package ForumWeek3; //folder name/directory

import java.util.Scanner;

public class Drill9 {
    public static void main(String[] args){
        System.out.println("Hello! I am a temperature converter program."+"\n"+"I shall convert any temperature in celcius to fahrenheit."+"\n"+"-----------------------------------------------------------");
        Scanner tempCheck = new Scanner(System.in); //new scanner named tempCheck to take inputs

        System.out.print("Input the temperature (°C) : "); 
        float celciusTemp = tempCheck.nextFloat(); //the scanner takes the input and stores it into the variable celcius Temp
        float fahrenheitTemp = (celciusTemp/5*9) + 32; //formula for convertion
        System.out.println("The converted temperature in fahrenheit is " + String.format("%.2f", fahrenheitTemp) +"°F"); //Formatting and printing the finished convertion

        tempCheck.close(); //closing the scanner
    } 
}