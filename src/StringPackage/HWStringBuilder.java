package StringPackage;

public class HWStringBuilder {
    public static void main(String[] args) {
        // Create 5 StringBuilder object and store 5 different woman bag brand name.
        // Create one array and store StringBuilder objects to the array.
        // Create one another array to store the establishment year of the brand.
        // Using loop add establishment years to the end of the StringBuilder.
        // For Example;
        // Brand Name is : PRADA
        // Excepted Result : PRADA - since 1913


        StringBuilder bag1 = new StringBuilder("Prada");
        StringBuilder bag2 = new StringBuilder("Micheal Kors");
        StringBuilder bag3 = new StringBuilder("Gucci");
        StringBuilder bag4 = new StringBuilder("Tory Burch");
        StringBuilder bag5 = new StringBuilder("Coach");

        StringBuilder[] bags = {bag1, bag2, bag3, bag4, bag5};
        int[] establisYear = {1913, 1981, 1938, 2004, 1941};

        StringBuilder established = new StringBuilder();
        for(int i=0;i<bags.length;i++){
            established=bags[i].append(" - since ").append(establisYear[i]);
            System.out.println(established);
        }

    }
}
