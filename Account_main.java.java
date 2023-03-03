//this is the main programm
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        double withdrawal_amount;
        Account acc_1=new Account("Pantelis Roumelis",1000);
        Account acc_2=new Account("Giannis Roumelis",500);
        System.out.printf("The balance of the for %s is:%.2f\n",acc_1.get_name(),acc_1.get_balance());
        System.out.println("Please enter the withdrawal amount that you want to exceed:");
        Scanner input=new Scanner(System.in);
        withdrawal_amount=input.nextInt();
        acc_1.withdrawal(withdrawal_amount);
        System.out.printf("The balance now is:%.2f",acc_1.get_balance());
        
    }
}