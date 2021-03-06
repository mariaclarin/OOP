package ForumWeek6;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args){
        //creating a new scanner to take user inputs called valInput
        Scanner valInput = new Scanner(System.in);
        //an int variable to store the inputs
        int NUM_ITEMS;
        // an array named numbers 
        int[] numbers;
        
        System.out.print("Enter the number of items : ");
        NUM_ITEMS = valInput.nextInt();
        
        //declines input if the number of items is 0 or a negative value
        while (NUM_ITEMS <= 0){
            System.out.println("Invalid input (Minimal Input is 0).");
            System.out.print("Enter the number of items : ");
            NUM_ITEMS = valInput.nextInt();
            continue;
        } 

        System.out.print("Enter the value of all items (separated by space ) : ");
        //the array numbers takes the value of NUM_ITEMS and uses it as its array size
        numbers = new int[NUM_ITEMS];
        //inserting the individual numbers into the array
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = valInput.nextInt();
        }
        //printing the output
        System.out.println("-".repeat(60));
        for (int i = 0; i < numbers.length; i++){
            String index = (i) + ": " ;
            String stars = "*".repeat(numbers[i]);
            String nums = "(" + numbers[i] + ")";
            System.out.println(index + stars + nums);
        }
        System.out.println("-".repeat(60));
        valInput.close();
    }
}
