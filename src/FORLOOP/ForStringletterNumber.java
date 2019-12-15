package FORLOOP;

public class ForStringletterNumber {
    public static void main(String[] args) {

        String name = "Tech1to5ri3al9";

        for (int i = name.length() - 1; i >= 0; i--) {
            for (char ch = '0'; ch <= '9'; ch++) {
                if (name.charAt(i) == ch) {
                    System.out.print(ch);
                }
            }
        }
        System.out.println();

        String school = "8710tech4to3ri8al9";
        for (int i = 0; i <= school.length() - 1; i++) {
            for (char ch = '0'; ch <= '9'; ch++) {
                if (school.charAt(i) == ch) {
                    System.out.print(ch);
                }
            }

        }

        System.out.println();
        String xxx = "123yase987bhvgf";
        for (int i = 0; i < xxx.length() - 1; i++) {
            for (char ch = '0'; ch <= '9'; ch++) {
                if (xxx.charAt(i) == ch) {
                    System.out.print(ch);
                }
            }
        }

        System.out.println();

        String yyy = "fytd1234678 bchghg";
        for (int i = 0; i <= yyy.length() - 1; i++) {
            for (char ch = '0'; ch <= '9'; ch++) {
                if (yyy.charAt(i) == ch) {
                    System.out.print(" yyy " +ch );

                }
            }

        }

        System.out.println();
        String aaa = "bhhb488647bnfn09";
        for (int i = aaa.length() - 1; i >= 0; i--) {
            for (char ch = '0'; ch <= 9; ch++) {
                if (aaa.charAt(i) == ch) ;
                System.out.println(ch);
            }
        }

    }
    }
