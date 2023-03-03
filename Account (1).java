// we creating a bank system similar 
// the programm is like other one but thisone is going to have withdrawal 
public class Account{
    private String name;
    private double balance;
    // this is the constructor
    public Account(String name,double balance){
        this.name=name;
        if (balance>0.0){
            this.balance=balance;
        }
    }
    public void set_name(String name){
        this.name=name;
    }
    public String get_name(){
        return name;
    }
    public void deposit_amount(double deposit){
        if (deposit>0.0){
            balance=balance+deposit;
        }
    }
     public void withdrawal(double amount){
        if (amount>balance){
            System.out.printf("withdrawal amount exceeded account balance");
        }
        else{
           balance=balance-amount;   
        }
        
    }
    
    public double get_balance(){
        return balance; 
    }
    
}