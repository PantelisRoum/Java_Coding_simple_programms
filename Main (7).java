/* this is the main programm*/
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        int i=1;
        Scanner input=new Scanner(System.in);
        while(true){
          System.out.println("If you want end the programm please enter the value -1");
          System.out.println("Please enter the value of the km:");
          int kilometres=input.nextInt();
          if (kilometres<=0){
              if(kilometres==-1){
                  break;
              }
              System.out.println("You entered an unaccptable value!PLease try again!");
            continue;
          }
          System.out.println("PLease enter the gas in litres:");
          int litres=input.nextInt();
          if (litres<=0){
              if(litres==-1){
                  break;
              }
              System.out.println("You entered an unaccptable value!Please try again!");
            continue;
          }

          kilometres_gas track=new kilometres_gas(kilometres,litres);
          /*track.set_khm(kilometres);
          track.set_lt(litres);*/
          System.out.printf("%dst trip\n%d kilometres\nyou burned:%d litres of gas\n",i,track.get_khm(),track.get_lt());
          System.out.printf("kilometres/litres:%.2f\n",track.khm_per_litre(kilometres,litres));
          i+=1;
        }
    
    System.out.printf("The programm is finished");   
    }
}