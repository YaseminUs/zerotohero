package interviewQuestion;

public class StringReverse {
    public static void main(String[] args) {

   String  name = "Yasemin Uslu";
   String reverse = "";
   for(int i=name.length()-1;i>=0;i--){
       reverse+=name.charAt(i);
   }
        System.out.println(reverse);
   if(name.equals(reverse)){
       System.out.println("is palindrome");
   }else{
       System.out.println("is not palindrome");
   }
   System.out.println("============");

   String n ="Rumeysa";
   String r ="";
   for(int i=n.length()-1;i>=0;i--){
       r+=n.charAt(i);
   }
        System.out.println(r);


   String ad = "Hello word";
   String revs = "";
   for(int i=ad.length()-1;i>=0;i--){
       revs+=ad.charAt(i);
   }
        System.out.println(revs);

   String names = "Yunus Uslu";   //array
   char[] revers = names.toCharArray();
   for(int i=revers.length-1;i>=0;i--){
       System.out.print(revers[i]);
   }
        System.out.println();


        String input="Yasemin";
        StringBuilder in = new StringBuilder(input).reverse();//stringBuilder
        System.out.println(in.toString());



        System.out.println("+++ interview +++");

        String question ="This is interview question";
        String[] words = question.split(" ");//String[] words =  "This is interview question".split(" ");
        String rev = "";
        for(int i = words.length - 1; i >= 0 ; i--) {
            rev += words[i] + " ";
        }
        System.out.println(rev);

        String cumle = "Java calisiyorum....";
        String gericumle = "";
        String [] kelime = cumle.split(" ");
        for(int i=kelime.length-1;i>=0;i--){
            gericumle+=kelime[i]+ "";
        }
        System.out.println(gericumle);


        String na = "I love you";
        String R ="";
        String [] w = na.split(" ");
        for(int i=w.length-1;i>=0;i--){
            R+=w[i]+" ";
        }
        System.out.println(R);




        System.out.println("=============");
        // can also use StringBuilder:
        StringBuilder revb = new StringBuilder();
        for(int i = words.length - 1; i >= 0 ; i--)
        {
            revb.append(words[i]);
            revb.append(" ");
        }
        System.out.println(revb);



        String yasemin = "Yasemin";
        String re = "";
        for(int i=yasemin.length()-1;i>=0;i--){
            re+=yasemin.charAt(i);

        }
        System.out.println(re);










    }


    }

