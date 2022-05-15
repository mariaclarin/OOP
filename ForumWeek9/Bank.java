import java.util.ArrayList;

public class Bank {
    //private attributes of the Bank Class
    private ArrayList<Customer> customerDataList = new ArrayList<Customer>();   //contains the data of customers in the Bank
    private ArrayList<String> currentCustomers = new ArrayList<String>();       //contains the formatted data of customers in the Bank for checking purposes (checkCustomer())
    private int numberOfCustomers;                                              //the number of customers in the bank
    private String bankName;                                                    //the name of the bank


    //Bank class constructor
    public Bank(String bName){
        this.bankName = bName;
        this.numberOfCustomers = 0;
    } 

    //getter method to get the Bank Name
    public String getName(){
        return this.bankName;
    }

    //public method to add a new customer to the bank
    public void addCustomer(String f, String l){
        Customer newAcc = new Customer(f, l);
        customerDataList.add(newAcc);
        String name = f+l;
        currentCustomers.add(name);
        this.numberOfCustomers+=1;
    }

    //getter method to get the number of customers
    public int getNumOfCustomers(){
        return this.numberOfCustomers;
    }

    //getter method to access a customer's data via its index in the arraylist.
    public Customer getCustomer(int index){ 
        return this.customerDataList.get(index);
    }

    //getter method to access a customer's data via its index in the formatted arraylist.
    public String getCurrentCustomer(int index){
        return currentCustomers.get(index);
    }

    //public method to check if the customer's account already exists or not in the bank for log in purposes.
    public boolean logInCustomer(String name){
        if(currentCustomers.contains(name)){
            System.out.println("Logged In Successfully.");
            return true;
        } else{
            System.out.println("Log In Fail. Try again.");
            return false;
        }
    }
    //public method to check account name availability.
    public boolean checkAcc(String name){
        if(currentCustomers.contains(name)){
            System.out.println("Account already exist. Please log in instead.");
            return false;
        } else{
            System.out.println("Account successfully created.");
            return true;
        }
    }
    

    //public method to find a customer's index by their name.
    public int findCustIndex(String name){
        return currentCustomers.indexOf(name);
    }

    //public method to display the registered customers of the bank.
    public void displayCustomers(){
        System.out.println("Registered Customers : ");
        for (int i = 0; i < customerDataList.size(); i++){
            System.out.println((i+1) + ". " +customerDataList.get(i).getFirstName() + " " + customerDataList.get(i).getLastName());
        }
    }


}
