import java.util.ArrayList;

public class Account {
    //private class attribute balance and private arraylist to store account activities.
    private double balance;
    private ArrayList<String> accHistory = new ArrayList<String>();

    //Account class constructor
    public Account(double balance){
        this.balance = balance;
    }

    //public getter method to get balance
    public double getBalance(){
        return this.balance;
    }

    //method to set balance for instantiated objects in the code (Ex. Elon Musk's Account in Driver.jave)
    public boolean setBalance(double amount){
        if (amount <=0){
            return false;
        }
        else{
            balance = amount; 
            return true;
        }
    }

    //public method for deposits
    public boolean deposit(double amount){
        //will only accepts deposits from $10 up to %10,000.
        if (amount <=9){
            System.out.println("Deposit Failed. Minimum deposit is $10.");
            return false;
        } 
        else if (amount>= 10001){
            System.out.println("Deposit Failed. Maximum deposit is $10,000.");
            return false;
        }
        else{
            balance += amount; 
            System.out.println("Deposit Successful. $" + amount + " added to the account.");
            accHistory.add("Deposit Done : $" + amount);
            return true;
        }
    }

    //public method for withdrawals.
    public boolean withdraw(double amount){
        //only accepts withdrawals from $10 up to account's full balance.
        if (amount <=9){
            System.out.println("Withdrawal failed. Minimum withdrawal is $10.");
            return false;
        }
        else if(amount>balance){
            System.out.println("Withdrawal failed. Insufficient balance.");
            return false;
        }
        else{
            balance -= amount; 
            System.out.println("Withdrawal Succesful. $" + amount + " withdrawned from the account.");
            accHistory.add("Withdrawal Done : $" + amount);
            return true;
        }
    }

    //public method to display account history
    public void displayHistory(){
        if (accHistory.size() != 0){
            for (int i = 0; i < accHistory.size(); i++){
                System.out.println((i+1) + ". " + accHistory.get(i));
            }
        } else {
            System.out.println("\t\t/ History Empty /");
        }
    }

    //public method for the receiving account of the transfer transaction
    public boolean transferReceive(double amount){
        //adds the transfer amount to the receiving account.
        balance += amount;
        System.out.println("Transfer Successful. $" + amount + " sent to the account.");
        accHistory.add("Transfer received : $" + amount);
        return true;
        
    }

    //public method for the sending account of the transfer transaction.
    public boolean transferSend(double amount){
        //only accepts transfer of funds starting from $10 up to account's full balance. 
        //Will reduce the sender's account balance with the transfer amount.
        if (amount <=9){
            System.out.println("Transfer Failed. Minimum transfer amount is $10.");
            return false;
        }
        else if(amount>balance){
            System.out.println("Transfer failed. Insufficient balance.");
            return false;
        }
        else{
            balance -= amount;
            System.out.println("Transfer Succesful. $" + amount + " deducted from the account.");
            accHistory.add("Transfer Sent : $" + amount);
            return true;
        }
    }
}
