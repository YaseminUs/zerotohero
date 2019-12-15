package Switch;

public class SwitchWeekday {
    public static void main(String[] args) {



       //1-5 --> weekdays
        //6-7-->weekends

        int number=6;
        switch (number){

            case 1: case 2: case 3: case 4: case 5:
                System.out.println("weekdays");
                break;
            case 6: case 7:
                System.out.println("weekends");
                break;
        }



    }
}
