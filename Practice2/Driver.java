package Practice2;

public class Driver {
    public static void main(String[] args){
        Account Maria = new Account();
        Maria.setBalance(300.00);
        Maria.deposit(100.00);
        Maria.withdraw(50.00);
        // Maria.checkBalance();
        // Maria.accountInfo();

        Circle nCircle = new Circle();
        nCircle.setRadius(7);
        nCircle.setColor("purple");
        System.out.println(nCircle.toString());
        System.out.println(String.format("%.2f", nCircle.getArea()));
        System.out.println(String.format("%.2f", nCircle.getCircumference()));        
    }
}
