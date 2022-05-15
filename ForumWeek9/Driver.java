import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //OBJECT INSTANTIATION
        //Creating a bank 
        Bank Bank1 = new Bank("Universal Bank Operator");

        //Adding a customer and setting the balance amount
        Bank1.addCustomer("Elon", "Musk");
        Bank1.getCustomer(0).getAccount().setBalance(100);

        //Printing the name of the bank and additional details.
        System.out.println("=================================================");
        System.out.println(Bank1.getName() + " - Station 1 Machine 001");

        int userinput = 0;

        while(userinput!=3){
            //available inputs for the first menu prompt (log in menu, new acc menu, or exit program)
            System.out.println("=================================================");
            System.out.println("1. Log in to an existing account" + "\n2. Create a new account" + "\n3. Exit Program");
            System.out.print("Enter your choice : ");
            userinput = input.nextInt();
        
            switch(userinput){
                case 1:
                    //LOGIN MENU 
                    //user inputs first and last name
                    System.out.println("================== Login Menu ===================");
                    System.out.print("Enter first name : ");
                    String fnameInput = input.next();
                    System.out.print("Enter last name : ");
                    String lnameInput = input.next();
                    String name = fnameInput + lnameInput;

                    //checks if the account is registered via the name inputted, if it is, will continue to the next prompt, 
                    //if not will be sent back to previous menu
                    if (Bank1.logInCustomer(name)==true){
                        int cusinput = 0;
                        while(cusinput!=6){

                            //TRANSACTION MENU 
                            System.out.println("=================================================");
                            System.out.println("1. Make Withdrawal" + "\n2. Create Deposit" + "\n3. Check Current Balance"+ "\n4. Check Account History" + "\n5. Transfer Balance" + "\n6. Return to previous page");
                            System.out.print("Enter your choice : ");
                            
                            cusinput = input.nextInt();

                            switch(cusinput){
                                case 1: 
                                    //WITHDRAWAL PROMPT
                                    System.out.println("=============== Withdrawal Menu =================");
                                    System.out.print("Enter withdrawal amount : ");
                                    double withdrawAmount = input.nextDouble();
                                    Bank1.getCustomer(Bank1.findCustIndex(name)).getAccount().withdraw(withdrawAmount);
                                    break;
                                case 2:
                                    //DEPOSIT PROMPT
                                    System.out.println("================= Deposit Menu ==================");
                                    System.out.print("Enter deposit amount : ");
                                    double depositAmount = input.nextDouble();
                                    Bank1.getCustomer(Bank1.findCustIndex(name)).getAccount().deposit(depositAmount);
                                    break;
                                case 3:
                                    //CHECK BALANCE PROMPT
                                    System.out.println("================= Account Menu ==================");
                                    System.out.println("Current Balance : $" + Bank1.getCustomer(Bank1.findCustIndex(name)).getAccount().getBalance());
                                    break;
                                case 4:
                                    //CHECK HISTORY PROMPT
                                    System.out.println("================= History Menu ==================");
                                    Bank1.getCustomer(Bank1.findCustIndex(name)).getAccount().displayHistory();
                                    break;
                                case 5:
                                    //TRANSFER PROMPT
                                    //will print out all the registered accounts in the bank for the user to choose who to transfer to.
                                    //user inputs the account no and transfer amount
                                    System.out.println("================= Transfer Menu =================");
                                    Bank1.displayCustomers();
                                    System.out.print("Enter account no. to transfer balance : ");
                                    int accNo = input.nextInt();
                                    
                                    //validity check for the account no. input
                                    while(accNo>Bank1.getNumOfCustomers()){
                                        System.out.print("Account Not Found. Please enter a valid account no. : ");
                                        int reAccNo = input.nextInt();
                                        accNo = reAccNo;
                                    }

                                    System.out.print("Enter amount to transfer into account : ");
                                    double transferAmount = input.nextDouble();
                                    
                                    //if the transferSend() method returns true, the transaction will continue and the amount
                                    //will be sent to the receiving account.
                                    //if the transaction fail, will return to the previous prompt.
                                    if(Bank1.getCustomer(Bank1.findCustIndex(name)).getAccount().transferSend(transferAmount) == true){
                                        Bank1.getCustomer(accNo-1).getAccount().transferReceive(transferAmount);
                                    }
                                    break;
                                    
                                case 6:
                                    //EXIT TRANSACTION MENU
                                    break;

                                default:
                                //Switch case validation
                                    System.out.println("Invalid Menu Input. Please try again.");
                                    break;   
                            }
                        }
                    }
                    //EXIT LOGIN MENU
                    break;
                    
                case 2:
                    //CREATE NEW ACCOUNT MENU 
                    //user inputs first name and last name
                    System.out.println("=============== New Account Menu ================");
                    System.out.print("Enter first name : ");
                    String fnameNew = input.next();
                    System.out.print("Enter last name : ");
                    String lnameNew = input.next();
                    String nameNew = fnameNew + lnameNew;

                    //check if name is already registered, if available will create acc and proceed to next prompt
                    //if not name is already in use, will return to the previous menu.
                    if(Bank1.checkAcc(nameNew)==true){
                         //user input first deposit.
                        System.out.print("Enter first deposit amount (Min. Amount: $50) : ");
                        double firstDepoAmount = input.nextDouble();

                        //for the initial deposit, minimum amount is $50 dollars will ask to reinput if it doesnt reach the min amount.
                        while (firstDepoAmount<50.0){
                            System.out.print("Minimal deposit is $50. Please reinput deposit amount.");
                            double reinDepoAmount =input.nextDouble();
                            firstDepoAmount = reinDepoAmount;
                        }

                        //adds the customer into the bank and deposits the initial deposit.
                        Bank1.addCustomer(fnameNew, lnameNew);
                        Bank1.getCustomer(Bank1.findCustIndex(nameNew)).getAccount().deposit(firstDepoAmount);

                        int newcusinput = 0;

                        while(newcusinput!=6){
                            //TRANSACTION MENU
                            System.out.println("=================================================");
                            System.out.println("1. Make Withdrawal" + "\n2. Create Deposit" + "\n3. Check Current Balance"+ "\n4. Check Account History" + "\n5. Transfer Balance" + "\n6. Return to previous page");
                            System.out.print("Enter your choice : ");
                            
                            newcusinput = input.nextInt();

                            switch(newcusinput){
                                case 1: 
                                    //WITHDRAWAL PROMPT
                                    System.out.println("=============== Withdrawal Menu =================");
                                    System.out.print("Enter withdrawal amount : ");
                                    double withdrawAmount = input.nextDouble();
                                    Bank1.getCustomer(Bank1.findCustIndex(nameNew)).getAccount().withdraw(withdrawAmount);
                                    break;
                                case 2:
                                    //DEPOSIT PROMPT
                                    System.out.println("================= Deposit Menu ==================");
                                    System.out.print("Enter deposit amount : ");
                                    double depositAmount = input.nextDouble();
                                    Bank1.getCustomer(Bank1.findCustIndex(nameNew)).getAccount().deposit(depositAmount);
                                    break;
                                case 3:
                                    //CHECK BALANCE PROMPT
                                    System.out.println("================= Account Menu ==================");
                                    System.out.println("Current Balance : $" + Bank1.getCustomer(Bank1.findCustIndex(nameNew)).getAccount().getBalance());
                                    break;
                                case 4:
                                    //CHECK HISTORY PROMPT
                                    System.out.println("================= History Menu ==================");
                                    Bank1.getCustomer(Bank1.findCustIndex(nameNew)).getAccount().displayHistory();
                                    break;
                                case 5:
                                    //TRANSFER PROMPT
                                    //will print out all the registered accounts in the bank for the user to choose who to transfer to.
                                    //user inputs the account no and transfer amount
                                    System.out.println("================= Transfer Menu =================");
                                    Bank1.displayCustomers();
                                    System.out.print("Enter account no. to transfer balance : ");
                                    int accNo = input.nextInt();

                                    //validity check for the account no. input
                                    while(accNo>Bank1.getNumOfCustomers()){
                                        System.out.print("Account Not Found. Please enter a valid account no. : ");
                                        int reAccNo = input.nextInt();
                                        accNo = reAccNo;
                                    }
                                    System.out.print("Enter amount to transfer into account : ");
                                    double transferAmount = input.nextDouble();

                                    //if the transferSend() method returns true, the transaction will continue and the amount
                                    //will be sent to the receiving account.
                                    //if the transaction fail, will return to the previous prompt.
                                    if(Bank1.getCustomer(Bank1.findCustIndex(nameNew)).getAccount().transferSend(transferAmount) == true){
                                        Bank1.getCustomer(accNo-1).getAccount().transferReceive(transferAmount);
                                    }
                                    break;
                                case 6:
                                    //EXIT TRANSACTION MENU
                                    break;

                                default:
                                //Switch case validation
                                    System.out.println("Invalid Menu Input. Please try again.");
                                    break;    
                            }
                        }
                    }
                    //EXIT CREATE NEW ACC MENU
                    break;
                
                case 3:
                    //EXIT PROGRAM
                    System.out.println("=================================================");
                    System.out.println();
                    System.out.println("\tTHANK YOU FOR USING THIS BANK !!! ");
                    System.out.println();
                    System.out.println("\t\t_$$$$$$___$$$$$$_");
                    System.out.println("\t\t$$$$$$$$_$$$$$$$$");
                    System.out.println("\t\t$$$$$$$$_$$$$$$$$");
                    System.out.println("\t\t_$$$$$$$$$$$$$$$_");
                    System.out.println("\t\t___$$$$$$$$$$$___");
                    System.out.println("\t\t_____$$$$$$$_____");
                    System.out.println("\t\t_______$$$_______");
                    System.out.println("\t\t________$________");
                    System.out.println();
                    System.out.println("=================================================");
                    break; 

                default:
                //Switch case validation
                    System.out.println("Invalid Menu Input. Please try again.");
                    break;
            }
        }
        input.close();
    }
}
