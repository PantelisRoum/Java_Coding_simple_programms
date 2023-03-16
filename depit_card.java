/* we are creating a programm who is small simulation
of bank's depit cards System that shows a cunsumer's depit card limit 
*/
public class depit_card{
    private int acc_number;
    private int balance;       /* balance at the begining of the month*/
    private int card_limit;    /* limits of the cards */ 
    private int total_debits_month;    /* total depits per month*/ 
    private int total_deposits_month;     /* total deposits per month*/
    public depit_card(int acc_number,int balance,int card_limit,int total_debits_month,int total_deposits_month){
        this.acc_number=acc_number;
        this.balance=balance;
        this.card_limit=card_limit;
        this.total_debits_month=total_debits_month;
        this.total_deposits_month=total_deposits_month;
    }
    public void set_acc_number(int acc_number)
    {
        this.acc_number=acc_number;
    }
    public int get_acc_number()
    {
        return acc_number;
    }
    public void set_balance(int balance){
        this.balance=balance;
    }
    public int get_balance(){
        return balance;
    }
    public void set_card_limit(int card_limit)
    {
        this.card_limit=card_limit;
    }
    public int get_card_limit()
    {
        return card_limit;
    }
    public void set_total_debits_month(int total_debits_month)
    {
        this.total_debits_month=total_debits_month;
    }
    public int get_total_debits_month()
    {
        return total_debits_month;
    }
    public void set_total_deposits_month(int total_deposits_month)
    {
        this.total_deposits_month=total_deposits_month;
    }
    public int get_total_deposits_month()
    {
        return total_deposits_month;
    }
    public int new_balance(int balance,int total_deposits_month,int total_debits_month){
        int new_balance=0;
        new_balance=balance+total_deposits_month-total_debits_month;
        return new_balance;
    }
}