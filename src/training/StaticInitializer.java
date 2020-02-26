package training;

import java.util.ArrayList;
import java.util.HashMap;

public class StaticInitializer {
public static ArrayList <Olive> oliveArrayList;
    static {
        System.out.println("Static is run!");
        oliveArrayList = new ArrayList<>();
        oliveArrayList.add(new Olive("Kalamata", 0x000000));
        oliveArrayList.add(new Olive("Picholine", 0x00FF00));
        oliveArrayList.add(new Olive("Ligurio", 0x000000));
    }

    public static void main(String[] args) {
        ArrayList <Olive> olives = oliveArrayList;
        for (Olive o :
                olives) {
            System.out.println("It's a "+o.oliveName+" olive!");
        }
    }
}
