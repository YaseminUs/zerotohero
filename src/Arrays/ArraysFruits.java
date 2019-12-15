package Arrays;

public class ArraysFruits {
    public static void main(String[] args) {

        String[] fruit1 = {"banana", "apple", "orange"};
        String[] furit2 = {"carrot", "tomato", "apple", "potato"};
         //ortak olani bulun

        for(int i=0;i<fruit1.length;i++){
            for(int k=0;k<furit2.length;k++){
                if(fruit1[i].equals(furit2[k])){
                    System.out.println(fruit1[i]);
                }
            }
        }

        for(String a:fruit1){
            for(String b:furit2){
                if(a.equals(b)){
                    System.out.println(a);
                }
            }
        }


//
//        for(int i=0;i<fruit1.length; i++){
//            boolean found=false;
//            for(int i2=0;i2<furit2.length;i2++){
//                if(fruit1[i] == furit2[i2]){
//                    System.out.println(fruit1[i]+ " is in there ");
//                    found=true;
//                }
//            }
//            if(found==false){
//                System.out.println(fruit1[i]+ " is NOT there! ");
//            }
//        }
//        for (int i = 0; i < fruit1.length; i++) {
//            for (int k = 0; k < furit2.length; k++) {
//
//                if (fruit1[i].equals(furit2[k])) {
//                    System.out.println(fruit1[i]);
//                }
//                }
//                }

//        for (String a : fruit1) {
//            for (String b : furit2) {
//                if (a.equals(b)) {     //(a.equals(b)){//(a == b)
//                    System.out.println(a);
//                }
//            }
//        }







        }

    }
