package StringPackage;

public class BuilderPractice {
  //task
    //Create the class called BuilderPractice
    //StringBuilder object value is "GAMKDKJDHO2UY658HFE7KN12BL39KGAE" DEFG
    //Create another StringBuilder Object and store only value between D to G and replace the char between
    //2-4 with SS

    public void checkBuilder(StringBuilder builder){
        StringBuilder bl=new StringBuilder();
        for(int i=0;i<builder.length();i++){
          char letter=  builder.charAt(i);
          if(letter>='D' && letter<= 'G'){
              bl.append(letter);
          }
        }
        bl.replace(2,4,"SS");
        System.out.println(bl);
    }

    public static void main(String[] args) {
        BuilderPractice pr = new BuilderPractice();
        pr.checkBuilder(new StringBuilder("GAMKDKJDHO2UY658HFE7KN12BL39KGAE"));


    }

}



