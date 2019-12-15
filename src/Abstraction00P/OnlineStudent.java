package Abstraction00P;

public class OnlineStudent extends Student {


    @Override
    public void study() {
        System.out.println("online student is studying harden than campus student");
    }

    @Override
    public void study(String name) {

    }

    @Override
    void attendClass() {
        System.out.println("they are attending through webinar");
    }
}
