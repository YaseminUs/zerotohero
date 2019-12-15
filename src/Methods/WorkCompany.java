package Methods;

public class WorkCompany {

    String compname;
    double amount;
    int Holiday;


        public  void info(){
            System.out.println("Company name " + compname);
            System.out.println("My sallary " + amount + " $");
            System.out.println("My Holiday "+ Holiday + " days");


        }
        public void company(){
            System.out.println("I am working in "+ compname);
        }

        public  double yearlyamount(){
            return amount;
        }

        public int holidayDay(){
            return Holiday;
        }

        public static void main(String[] args) {

       WorkCompany wc=new WorkCompany();
        wc.compname="All State";
        wc.amount=100000;
        wc.Holiday=15;
        wc.info();
        wc.company();

        }






}
