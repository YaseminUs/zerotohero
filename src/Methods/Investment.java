package Methods;

public class Investment {

    double years;//2
    double amount;//100
    double rate;//5

    public double rateAmaount(){
        return amount*rate*years/100; //100*5*2/100--->1000/100-->10
    }

    public double totalAmount(){
        return rateAmaount()+ amount;//100+10--->110
    }







}
