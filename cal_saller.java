public class cal_saller{
    private int product;
    public cal_saller(int product){
        this.product=product;
        
    }
    public void set_product(int product){
        this.product=product;
    }
    public int get_product(){
        return product;
    }
    public double type_product(int product){
        double price;
        if(product==1){
            return price=239.99;
            
        }
        else if(product==2){
            return price=129.75;
        }
        else if(product==3){
            return price=99.95;
        }
        else if(product==4){
            return price=350.89;
        }
        else{
             return 0;
        }
    }
} 