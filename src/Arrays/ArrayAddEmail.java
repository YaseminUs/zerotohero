package Arrays;

import java.util.Arrays;

public class ArrayAddEmail {
    public static void main(String[] args) {
        String names[] = {"Lisa","Kubat", "Yalcin", "Erkin", "Sema", "Kira"};
        //write program yhat will convert this names to emails and will save to array
        //for example:[lisa@gmail.com, kubat@gmail.com,yalcin@gmail.com.....]

        String[] emails=new String[names.length];
        for(int i=0; i<names.length; i++){
            emails[i]=names[i]+ "@gmail.com";
        }
        System.out.println(Arrays.toString(emails));

        String[] myfamily={ "yasemin", "yunus", "bera","erva","azra"};
        String [] email=new String[myfamily.length];


        for(int i=0;i<myfamily.length;i++){
            email[i]=myfamily[i]+"@gmail.com";
        }

        System.out.println(Arrays.toString(email));

        String[]fruits={"portakal","elma","cilek","mandalina"};
        String [] vegi=new String[fruits.length];

        for(int i=0;i<fruits.length;i++){
            vegi[i]=fruits[i]+ " vs vegetable ";
        }
        System.out.println(Arrays.toString(vegi));


        String [] name={"yasemin","yunus","bera","erva","azra"};
        String [] lastname=new String[name.length];
        for(int i=0;i<name.length;i++){
            lastname[i]=name[i]+ " uslu ";
        }
        System.out.println(Arrays.toString(lastname));

    }
}
