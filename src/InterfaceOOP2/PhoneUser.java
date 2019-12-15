package InterfaceOOP2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PhoneUser {
    public static void main(String[] args) {

     Iphone iphone = new Iphone();
     iphone.call();
     iphone.text();
     iphone.takePicture();

     Samsung samsung = new Samsung();
     samsung.faceId();

        List<String> list = new ArrayList<>();


    }
}
