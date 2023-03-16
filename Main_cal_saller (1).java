/* Roumelis Pantelis 
/* Unicersity of Ioannina Department of Telecomunication and Informatics*/ 
import java.util.Scanner;
public class Main_cal_saller{
    public static void main(String[] args){
        double sum=0.0;
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.printf("If you want to stop the programm please enter -1\n");
            System.out.printf("please enter the product number:");
            int product_number=input.nextInt();
            if (product_number==-1){
                break;
            }
            cal_saller x=new cal_saller(product_number);
            double i=x.type_product(product_number);
            sum=sum+i;
        }
    double total_sum=sum+sum*9/100;
    System.out.printf("The salary of the seller is:%.2f",(total_sum + 200));
    }
}