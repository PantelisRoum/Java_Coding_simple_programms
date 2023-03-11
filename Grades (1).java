import java.util.Scanner ;
public class Grades{
 public static void main(String[] args){
    Scanner input =new Scanner(System.in);
    int passes=0;
    int failes=0;
    while(true){    //if you want to get out out of the loop you should enter -1
     System.out.printf("If you want to stop enter -1\n");
     System.out.printf("Please enter system the grade of:");
     double grade=input.nextInt();
     if (grade==-1){
         break;
     }
     if (grade>5){
         passes=passes+1;
     }
     else{
         failes=failes+1;
     }
     
    }
    System.out.printf("The student that passed the lesson is:%d\n",passes);
    System.out.printf("The student that failed at the exams is:%d",failes);
    
   }
}