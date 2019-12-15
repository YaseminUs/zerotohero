package Arrays;

public class ArraysString {
    public static void main(String[] args) {

       // int[ ]number=new int[5];
        String[] words=new String[5];
        words[0]="java";
        words[1]="Programming";
        words[2]="language";
        words[3]="I";
        words[4]="love"; //kaldirirsak asagida null yazar

        for(int i=0; i<words.length; i++){
            System.out.println(words[i]);
        }
        System.out.println("---------");

        for(String word: words){   ///array icin kullanilan kisa yol
            System.out.println(word);
        }

        int [] nums={100, 300, 44, 32, 9, 3,};
        for (int n:nums){
            System.out.println(n);
        }



    }
}
