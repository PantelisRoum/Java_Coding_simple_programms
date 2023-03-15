/* aks 416 */
public class kilometres_gas{
    private int khm;/* kilometres*/
    private int lt; /* litres*/
    public kilometres_gas(int khm,int lt){
        this.khm=khm;
        this.lt=lt;
    }
    public  void set_khm(int khm){
        this.khm=khm;
    }
    public  int get_khm(){
        return khm;
    }
    public void set_lt(int lt){
        this.lt=lt;
    }
    public int get_lt(){
        return lt;
    }
    public double khm_per_litre(int khm,int lt){
        double khm_p_litre;
        return khm_p_litre=khm/lt;
    }
}