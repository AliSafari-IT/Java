package training;

import java.util.ArrayList;
import java.util.Arrays;

public class array2ArrayList {

    public static void main(String[] args) {
        Olive o1 = new Olive("Kalamata", 0x000000);
        Olive o2 = new Olive("Picholine", 0x00FF00);
        Olive o3 = new Olive("Ligurio", 0x000000);

        Olive[] olives = {o1, o2, o3};
        System.out.println("Normal Array: in arrays you must set the size in advance or while initializing.");
        System.out.println(Arrays.toString(olives));

        // adding Olive objects to the arrayList using the function: Arrays.asList
        ArrayList<Olive> arrayList = new ArrayList<>(Arrays.asList(olives));
        System.out.println("adding Olive objects to the arrayList using the function: Arrays.asList");
        System.out.println(arrayList);

    }
}
