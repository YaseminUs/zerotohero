package interviewQuestion;

public class sum {
    public static void main(String[] args) {

        //1 to 10 sum
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        for (int i = 0; i < 5; i++) {
            System.out.println("i love you");
        }
        System.out.println();

       String name = "I love you";
       String rev = "";
       String[]words = name.split(" ");
       for(int i =words.length-1;i>=0;i--){
           rev+=words[i]+ " ";
       }
        System.out.println(rev);

        }
    }
