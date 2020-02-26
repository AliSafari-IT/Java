package training;

import java.util.ArrayList;

public class NonStaticInitializer {
    public ArrayList<Olive> oliveArrayList;

    public NonStaticInitializer() {
    }

    {
        // Non static initializer
        System.out.println("Initializing Using Non-Static Initializer!");
        oliveArrayList = new ArrayList<>();
        oliveArrayList.add(new Olive("Kalamata", 0x000000));
        oliveArrayList.add(new Olive("Picholine", 0x00FF00));
        oliveArrayList.add(new Olive("Ligurio", 0x000000));
    }

    public static void main(String[] args) {
        System.out.println("Running Application");
        NonStaticInitializer initializer = new NonStaticInitializer();
        ArrayList<Olive> olives = initializer.oliveArrayList;
        for (Olive o :
                olives) {
            System.out.println("It's a " + o.oliveName + " olive!");
        }
    }
}
