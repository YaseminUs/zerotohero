package TernaryOperators;

public class OrderNumberHomework {
    public static void main(String[] args) {

//   1-  one > two
//   2-  one > three
//   3-  one > four
//   4-  two > three
//   5-  two > four
//   6-  three > four
//
//        int one=12;
//        int two=4;
//        int three=7;
//        int four=3;
//        if(one>two){
//            int temp=one; //temp=12
//            one=two; //one=4
//            two=temp; // two=12
//        }
//        if(one>three){
//            int temp=one;//4
//            one=three;//7
//            three=temp;//4
//        }
//        if(one>four){
//            int temp=one; // tem=4;
//            one=four; // one=3;
//            four=temp; // four=4;
//        }
//        if(two> three){  // two=12 , three=7
//            int temp=two; // temp=12
//            two=three; // two=7;
//            three=temp; // three=12
//        }
//        if(two>four){ // two=7 , four= 4
//            int temp=two; // temp=7
//            two=four; // two = 4
//            four=temp; // four= 7
//        }
//        if(three> four){ // three=12 , four= 7
//            int temp=three; // temp = 12;
//            three=four; // three=7
//            four=temp; //  four=12
//        }
//        // one= 3  , two=4   , three=  7 , four= 12
//        System.out.println(""+one+"\n"+two +"\n"+ three +"\n"+four);
//        System.out.println(""+four+"\n"+three +"\n"+ two +"\n"+one);
//    }
//}
          int one=15;                 //one>two     //two>three
          int two=6;                  //one>three   //two>four
          int three=0;                //one>four   //five>six
          int four=4;                 //one>five
          int five=11;                //one>six
          int six=2;

          if(one>two){
              int temp=one;//0ne 15
              one=two;// one 6
              two=temp;// two 15
          }
          if(one>three){
              int temp=one; //0ne 6
              one=three;// one 0
              three=temp;// three 6
          }
          if(one>four){
            int temp=one; //0ne 0
            one=four;// one 4
            four=temp;// four 0
          }

          if(one>five){
            int temp=one; //0ne 4
            one=five;// one 11
            five=temp;// five 4
          }
          if(one>six){
            int temp=one; //0ne 11
            one=six;// one 2
            six=temp;// six 11
          }
          if(two>three){
            int temp=two; //two 15
            two=three;// two 6
            three=temp;// three 15
          }
           if(two>four){
            int temp=two; //two 6
            two=four;// two 0
            four=temp;// four 6
           }
           if(five>six){
            int temp=five; //five 4
            five=six;// five 11
            six=temp;// six 4
               //one=2 two=0 three=15 four=6 five=11 six=4
          }
        System.out.println("" + one + "\n" + two + "\n" + three + "\n" + four + "\n" + five + "\n" + six );
        System.out.println("" + six + "\n" +five + "\n"+ four + "\n" + three + "\n" + two + "\n" + one);


    }
}
