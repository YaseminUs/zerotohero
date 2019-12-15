package ArrayListPractice;

import java.util.ArrayList;

public class Snapshot {

    ArrayList<Integer> data;
    public Snapshot(ArrayList<Integer> data) {
        // this.data=data;
        this.data = new ArrayList<Integer>();
        for (Integer d : data) {
            this.data.add(d);
        }
    }
    public ArrayList<Integer> restore() {
        System.out.println("Calling" + data);
        return data;
    }
}



