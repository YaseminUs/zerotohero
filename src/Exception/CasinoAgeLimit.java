package Exception;

public class CasinoAgeLimit {

    private String name;
    private int age ;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public CasinoAgeLimit(String name,int age){
        this.name = name;
        this.age = age;
    }
    public static void CasinoAccess(CasinoAgeLimit ageLimit)throws Exception{
        if(ageLimit.getAge()< 21){
            throw new Exception("Hey you can not play in Casino");
        }
        System.out.println(ageLimit.getName()+ "Welcome to Casino");
    }


    public static void main(String[] args) throws Exception{

        CasinoAgeLimit casinoAgeLimit = new CasinoAgeLimit("John",20);
        casinoAgeLimit.CasinoAccess(casinoAgeLimit);

        CasinoAgeLimit casinoAgeLimit1 = new CasinoAgeLimit("David",18);
        casinoAgeLimit1.CasinoAccess(casinoAgeLimit);
        System.out.println("My code is finished");


    }


}
