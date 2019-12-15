package Methods;

public class MinMaxExample {
    public int getMax(int[] ArrayGir) {
        int maxvalue = ArrayGir[0];
        for (int i = 0; i < ArrayGir.length; i++) {
            if (ArrayGir[i] > maxvalue) {
                maxvalue = ArrayGir[i];
            }
        }
        return maxvalue;
    }

    public int getMin(int[]ArrayGir){
        int minvalue = ArrayGir[0];
        for(int i=0;i<ArrayGir.length;i++){
            if(ArrayGir[i]< minvalue){
                minvalue=ArrayGir[i];

            }

        }
    return minvalue;

    }

    public static void main(String[] args) {
        int array[] = new int[]{10, 11, 88, 2, 12, 120};

        MinMaxExample mx=new MinMaxExample();
        mx.getMax(array);
        mx.getMin(array);
        System.out.println("Maximum Value is: " + mx.getMax(array));
        System.out.println("Minumum Value is: " + mx.getMin(array));

    }






}
