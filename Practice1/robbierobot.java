package Practice1;
import java.util.Scanner;

public class robbierobot {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int run = 1; // 1 = code is still running
        int x_cord = 0; // x coordinate
        int y_cord = 0;// y coordinate
        int dst = 0;// distance

        while (run == 1) { // if run not = 1, code exit
            System.out.println("Give instructions to Robbie:");
            System.out.println("1. Robbie-Move");
            System.out.println("2. Location Identifier");
            System.out.println("3. Reset Location to 0");
            System.out.println("4. Exit");

            System.out.println("-------------------------------------------------------");

            int choice = Input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Direction for Robbie to go:");
                    System.out.println("N - North");
                    System.out.println("E - East");
                    System.out.println("S - South");
                    System.out.println("W - West");
                    System.out.println("-------------------------------------------------------");
                    String direction = Input.next();

                    if (direction.equals("N")) { // North = Y + 1
                        System.out.println("Enter distance to move North (More than 0): ");
                        dst = Input.nextInt();
                        y_cord = y_cord + dst;
                        System.out.println("Robby moved North ---->" + " " + dst);
                        System.out.println("-------------------------------------------------------");

                    } else if (direction.equals("S")) { // South = Y-1
                        System.out.println("Enter distance to move South (More than 0): ");
                        dst = Input.nextInt();
                        y_cord = y_cord - dst;
                        System.out.println("Robby moved South ---->" + " " + dst);
                        System.out.println("-------------------------------------------------------");

                    } else if (direction.equals("E")) { // East = X+1
                        System.out.println("Enter distance to move East (More than 0): ");
                        dst = Input.nextInt();
                        x_cord = x_cord + dst;
                        System.out.println("Robby moved East ---->" + " " + dst);
                        System.out.println("-------------------------------------------------------");

                    } else if (direction.equals("W")) { // West = X-1
                        System.out.println("Enter distance to move West (More than 0): ");
                        dst = Input.nextInt();
                        x_cord = x_cord - dst;
                        System.out.println("Robby moved West ---->" + " " + dst);
                        System.out.println("-------------------------------------------------------");
                    }
                    break;

                case 2:
                    if (x_cord == 0 && y_cord == 0) {
                        System.out.println("Robby is back at ground 0 (0,0)"); // initialized if Robbie is back at 0
                        System.out.println("-------------------------------------------------------");
                    } else {
                        System.out.println("Robby is now at this location ----> (" + x_cord + "," + y_cord + ")");
                        System.out.println("-------------------------------------------------------");
                    }
                    break;

                case 3:
                    System.out.println("Robby is being reset at -----> (" + x_cord + "," + y_cord + ")"); // resets
                    // coordinate
                    System.out.println("-------------------------------------------------------");

                    x_cord = 0;
                    y_cord = 0;
                    break;

                case 4:
                    System.out.println("Bye! See you soon!");
                    System.out.println("-------------------------------------------------------");
                    run = 0; // kill program
                    break;
            }
        }
        Input.close();
    }
}