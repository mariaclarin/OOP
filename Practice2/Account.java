package Practice2;

public class Account {
    //attribute
    double balance;

    int depocount = 0;
    int withdrawcount = 0;
    
    //the methods
    public void deposit (double money){
        balance += money;
        depocount+=1;
    }
    public void withdraw(double money){
        balance -= money;
        withdrawcount+=1;
    }
    public void checkBalance(){
        System.out.println("Your current balance is : $" +  String.format("%.2f",balance));
    }
    //additional account info method
    public void accountInfo(){
        System.out.println("====================================");
        System.out.println("Here is your account information:");
        if(depocount!=0){
            System.out.println(depocount+ " deposits was done.");
        } 
        if(withdrawcount!=0){
            System.out.println(withdrawcount+ " withdrawals was done.");
        }
        System.out.println("Your current balance is : $" +  String.format("%.2f",balance));
        System.out.println("====================================");
    }

    //setter getter
    public void setBalance(double money){
        balance = money;
    }
    public double getBalance(){
        return balance;
    }
}
