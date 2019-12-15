package ArrayListPractice;

import java.util.ArrayList;

public class SnapshotTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        // In this line we are adding the 1, 2 to the ShopShot object.
        Snapshot snap = new Snapshot(list);
        // In this line we are changing 1 with value of 3.
        list.set(0, 3);
        // We are calling restore method to revert back to the value of 1 , 2.
        list = snap.restore();
        System.out.println(list);
        //Since I have called the restore() method. It should print “[1,2]" but currently it is printing [ 3, 2 ] in this line.
        list.add(4);
        list = snap.restore();
        System.out.println(list); //It should print "[1,2]"
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(13);
        list.add(44);
        list = snap.restore();
        System.out.println(list); //It should print "[1,2]"
    }
}
