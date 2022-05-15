public class Customer {
    //private attributes of the Customer Class
    private String firstName; 
    private String lastName;  
    private Account account;  

    //Customer class constructor
    public Customer(String f, String l){
        this.firstName = f;
        this.lastName = l;
        this.account = new Account(0.0);
    }

    //getter method to get the customer's first name
    public String getFirstName(){
        return this.firstName;
    }

    //getter method to get the customer's last name
    public String getLastName(){
        return this.lastName;
    }

    //getter method that links to the account of the customer (links to the Account class) 
    public Account getAccount(){
        return account;
    }

    //public method to set an account
    public void setAccount(Account account){
        this.account = account;
    }
}
