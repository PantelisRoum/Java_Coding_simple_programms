/*This code created for educatrional reasons
/* From student Roumelis Pantelis
/* University of Ioannian 
Department of Telecomunication and Informatics 
/* this is main programm*/
public class Main_depit_card
{
    public static void main(String [] args){
        depit_card Consumer_1=new depit_card(234746,1000,5000,500,700); /* we are creating an object of class depicard */
        int x=Consumer_1.new_balance(1000,500,700);
        int y=Consumer_1.get_card_limit();
        if(x>=y){ /* if new balance is bigger from the gredit card limit you can not use card */
           System.out.println("Credit card limit exceeded");
        }
        else{
            System.out.println("You can use your depitcard");
       }
    }
}
