package MyPractice;

public class PRACTICE {
    public static void main(String[] args) {

//        String name="a";
//        String name1="b";
//        name="c";        //c ile a eslestiigi icin name artik c oldugundan a garbage system.gc


        String name="";
        for(char i='a';i<='z';i++){
            name+=i;
        }
        System.out.println(name);
    }
}
