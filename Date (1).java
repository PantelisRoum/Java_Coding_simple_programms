//this is programm that it respresents a date 
public class Date{
    private int month;
    private int day;
    private int year;
    public Date(int month,int day,int year){
        if (month>0 && month <=31){
            this.month=month;
        }
        if (day>0 && day<=7){
            this.day=day;
        }
        if (year>0){
            this.year=year;
        }
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
    public void display(int month,int day,int year){
        System.out.printf("%d/%d/%d",month,day,year);
    }
}