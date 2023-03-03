// this is the main programm 
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        HeartRates x = new HeartRates("Pantelis","Roumelis",8,28,2002);
        System.out.println("The information of the patient:");
        System.out.printf("Name:%s\nSurname:%s\nBirtday:%d/%d/%d\n",x.get_name(),x.get_surname(),x.get_month(),x.get_day(),x.get_year());
        System.out.printf("Age:%d\n",x.get_age()); 
        int n=x.get_age();
        System.out.printf("Max heartrate is:%d\n",x.max_heartrate(n));
        double y=x.max_heartrate(n);
        System.out.printf("Goal heartrate is:%.2f",x.goal_heartrate(y));
        
    }
}