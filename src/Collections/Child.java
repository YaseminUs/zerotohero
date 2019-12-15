package Collections;

public class Child {

    //creat one child class having name, age gender,city as private instance variables
    //create the method it will check the child can go to school or not
    //if the age is more than 6 child can go to school or can not go
   //this method will true/false
   //create the method will check the name of the child,if child name is Palindrome it will return true or it will return false
   //create one child test class
   //create five diffrent object of child.two child name will be palindrome
   //store all the child to the LinkHasMap

    private String name;
    private int age;
    private char gender;
    private String city;

    public Child(String name,int age,char gender,String city){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public boolean gotoschool(){
        if(age>6) {
            System.out.println("child can go to school");
            return true;
        }
        System.out.println("child can not go to school");
        return false;
        }

    public boolean isPalindrome(String str){

        int k = str.length();
            for (int i = 0; i < k / 2; i++) {
                if (str.charAt(i) != str.charAt(k - i - 1)) {
                    return false;
                }
            }
            return true;

        }
    }













