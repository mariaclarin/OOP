

import java.util.Scanner;

public class Robby {
    public static void main(String[] args){
        System.out.println("Robby Instructions");
        System.out.println("1. Move"+"\n"+"2. Location"+"\n"+"3. Reset"+"\n"+"4. Quit");
        
        Scanner noInput = new Scanner(System.in);
        System.out.print("Choice >> ");
        int action = noInput.nextInt();
        
        switch(action){
            case 1 : 
                Scanner direction = new Scanner (System.in);
                System.out.print("Enter direction (N,E,W,S) >> ");
                String directionInput = direction.nextLine();

                if (directionInput=="N"){
                    directionInput="North";
                }else if (directionInput=="E"){
                    directionInput="East";
                }else if (directionInput=="W"){
                    directionInput="West";
                }else if (directionInput=="S"){
                    directionInput="South";
                }
                
                Scanner distance = new Scanner(System.in);
                System.out.print("Enter distance (>0) >> ");
                int distanceInput = distance.nextInt();
                 
                System.out.println("Robby moved "+directionInput+", "+distanceInput+" units");
                break;
            case 2:
                System.out.println("hello");
        }

        noInput.close();
    }
}
