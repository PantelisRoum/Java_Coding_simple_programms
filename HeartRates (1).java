// this is the HeartRates programm 
import java.time.Year;
public class HeartRates{
    private String  name;
    private String surname;
    private int month;
    private int day;
    private int year;
    private int x=220; 
    public int this_year=Year.now().getValue(); // the get the year 
    public HeartRates(String name,String surname,int month,int day,int year){// conctructor of the class 
        this.name=name;
        this.surname=surname;
        if(month>0 && month<=31){
            this.month=month;
        }
        if(day>0 && day <7){
            this.day=day;
        }
        if(year>0){
            this.year=year;
        }
        
    }
    public void set_name(String name){
        this.name=name;
    }
    public String get_name(){
        return name;
    }
    public void set_surname(String surname){
        this.surname=surname;
    }
    public String get_surname(){
        return surname;
    }
    public void set_month(int month){
        this.month=month;
    }
    public int get_month(){
        return month;
    }
    public void set_day(int day){
        this.day=day;
    }
    public int get_day(){
        return day;
    }
    public void set_year(int year){
        this.year=year;
    }
    public int get_year(){
        return year;
    }
    public void set_this_year(int this_year){
        this.this_year=this_year;
    }
    public int get_age(){
        int age;
        age=this_year-year;
        return age;
    }
    public int max_heartrate(int age){
        // this fub=ction for maximum+HeartRates
        int max_heart_rate;
        max_heart_rate=x-age;
        return max_heart_rate;
    }
    public double goal_heartrate(double max_heart_rate){
        double goal_heart_rate;
        goal_heart_rate=max_heart_rate*0.6;
        return goal_heart_rate;
    }
    
    
}