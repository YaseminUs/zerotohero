package interviewQuestion;

public class StringLetterNumber {

    public static void main(String[] args) {
        String name ="4672hgwfjfskv56";
        for(int i=0;i<= name.length()-1;i++){
            for(char ch='0';ch<='9';ch++){
                if(name.charAt(i)==ch){
                    System.out.print(ch);
                }
            }
        }
        System.out.println();
        String xxx ="674fghdhd7588";
        for(int i=0;i<=xxx.length()-1;i++){
            for(char ch='0';ch<='9';ch++){
                if(xxx.charAt(i)==ch){
                    System.out.print(ch);
                }
            }
        }

        System.out.println("++++++++++++");

        String yyy="6596962gwfaksa6f7g7688";
        for(int i=yyy.length()-1;i>=0;i--){
            for(char ch='0';ch<='9';ch++){
                if(yyy.charAt(i)==ch){
                    System.out.print(ch);
                }
            }
        }
        System.out.println();
      String number = "123abc457def89";
      for(int i=0;i<=number.length()-1;i++){
          for(char ch = '0';ch<='9';ch++){
              if(number.charAt(i)==ch){
                  System.out.print(ch);
              }
          }
      }
        System.out.println();

      String number1 ="123abc457def89";
      for(int i=number1.length()-1;i>=0;i--){
          for(char ch='0';ch<='9';ch++){
              if(number1.charAt(i)==ch){
                  System.out.print(ch);
              }
          }
      }


    }
}
