package StringBuilder;

import java.util.Arrays;

public class StringBuilderCalisma {
    public static void main(String[] args) {
//
//        String name="a";
//        String name1="b";
//        name="c"; // after c "a" going garbage

        String names = " ";
        for (char i = 'a'; i <= 'z'; i++) {
            names += i;
        }
        System.out.println(names);

        StringBuilder table = new StringBuilder();
        StringBuilder table1 = new StringBuilder("Rockwell ");

        System.out.println(table);

        //you can not assign like that
        // table="ikea";
        // Dynamic Polymorhism ---> interv

        table.append("ikea ");
        System.out.println(table);
        table.append(10);
        System.out.println(table);

        String name = "ikea ";
        name.concat("10");
        System.out.println(name);

        table1.append(10.4);
        System.out.println(table1);

        StringBuilder succes = new StringBuilder().append("Techtorial ").append(2019);
        succes.append(" Best Year Ever ").append(true);
        System.out.println(succes);

        StringBuilder computer = new StringBuilder();
        for (char i = 'a'; i < 'z'; i++) {
            computer.append(i);
        }
        System.out.println(computer);

        StringBuilder success = new StringBuilder("Working Hard ");
        success.append("does not make you successful");
        System.out.println(success);
        StringBuilder truth = success.append(" Thinking hard makes you successful");
        System.out.println(truth);

        StringBuilder success1 = new StringBuilder("Tech");
        success1.append("torial ");
        StringBuilder trut = success1.append("2019");
        trut = trut.append(" Best").append(" Summer ");

        System.out.println(success1);
        System.out.println(trut);

        success1.append(10);

        System.out.println(success1);
        System.out.println(trut);

        StringBuilder tree = new StringBuilder("Oak");
        StringBuilder tree1 = new StringBuilder("Oak").append(" 14");
        System.out.println(tree);
        System.out.println(tree1);

        char nm = tree.charAt(0);
        System.out.println(nm);//a
        System.out.println(tree);//Oak

        // if you call the method and return type StringBuilder , in this your original StringBuilder value will change
        //.append();--->StringBuilder

        //indexOf-----

        int index = tree.indexOf("Oak");
        System.out.println(index);
        //substring-----
        int length = tree.length();
        System.out.println(length);
        String subs = tree.substring(1);
        System.out.println(subs);//ak
        System.out.println(tree);//Oak

        String tr = tree1.append(" 10 ").append(true).substring(0).substring(1);
        System.out.println(tr);

        tree1.append(" KKK ").append(6.4);
        System.out.println(tree1);

        StringBuilder apple = new StringBuilder("Aple");
        apple.insert(1, "p");
        System.out.println(apple);//apple

        apple.insert(5, "s number is 10");
        System.out.println(apple);
        System.out.println(tree);
        System.out.println(tree1);

        StringBuilder success2 = new StringBuilder();
        success2.append("preparation");
        success2.insert(0, "$");
        System.out.println(success2);
        success2.insert(12, "$");
        System.out.println(success2);
        success2.insert(3, "-");
        System.out.println(success2);

        //loop  .insert(2,"-");---lo-op


        //task-- store the hypen after 2 index StringBuilder object
        //Ap-ples number is 10
        //Oa-k
        //Oa-k 14 10 true KKK 6.4
        StringBuilder[] builders = {tree, tree1, computer, apple};

        for (StringBuilder b : builders) {
            b.insert(2, "-");
        }
        System.out.println(Arrays.toString(builders));

        //Muammer Turan
        //236-Muammer Turan
        StringBuilder id = new StringBuilder("Muammer Turan");
        id.insert(0, "236 - ");
        System.out.println(id);
        id.append(" Techtorial ").append("Academy ").append("2019").insert(19, " -");
        id.delete(20,21);
        System.out.println(id);



        StringBuilder mouse=new StringBuilder("Microsoft");
        mouse.delete(0,3);
        System.out.println(mouse);//rosoft
        mouse.deleteCharAt(2);
        System.out.println(mouse);
        String ms=mouse.substring(0,3);
        System.out.println(ms);

        StringBuilder sName=new StringBuilder("Kuttubek");
        sName.delete(1,4);
        System.out.println(sName);
        sName.deleteCharAt(1);
        System.out.println(sName);
        //sName.deleteCharAt(4);
        //System.out.println(sName);//boundsException

        mouse.reverse();
        System.out.println(mouse);
        tree1.reverse();
        System.out.println(tree1);

        String mouse1=mouse.toString();
        String mouse2=mouse.substring(0);
        String mouse3="mouse";
        System.out.println(mouse1);

        StringBuilder sname=new StringBuilder("Techtorial");
        //String schoolname=sname;------> it will not compile
        String schoolname=sName.toString();
        System.out.println(sname);

        StringBuilder camera=new StringBuilder();
        StringBuilder camera1=new StringBuilder();
        System.out.println(camera.equals(camera1));

        String car=new String("Toyota");
        String car1="Toyota";
        System.out.println(car==car1);

        StringBuilder basari=new StringBuilder("Working hard").append(" does not make you successful.").append("Thinking hard makes you successful");
        System.out.println(basari);


        StringBuilder ozlusoz=new StringBuilder("Baslamak ");
        ozlusoz.append("bitirmenin ").append("yarisidir");
        System.out.println(ozlusoz);
        char oz=ozlusoz.charAt(5);
        System.out.println(oz);
        int indexx=ozlusoz.indexOf("l");
        System.out.println(indexx);
        String sub=ozlusoz.substring(3,8);
        System.out.println(sub);
        int lengt=ozlusoz.length();
        System.out.println(lengt);
        ozlusoz.insert(8," -");
        System.out.println(ozlusoz);
        //ozlusoz.reverse();
        //System.out.println(ozlusoz);

        ozlusoz.append(" Hadi bakalim ").insert(45,"Bismillah").delete(9,11);
        System.out.println(ozlusoz);
        String sc=ozlusoz.toString();
        System.out.println(sc);
        ozlusoz.reverse();
        System.out.println(ozlusoz);
       String sub1= ozlusoz.substring(3,8);
        System.out.println(sub1);



    }
}
