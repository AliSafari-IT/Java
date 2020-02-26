package training;

import java.util.ArrayList;
import java.util.HashMap;

public class StaticInitializer {
public static ArrayList <Olive> oliveArrayList;
    static {
//        The code in the "static" section(s) will be executed at class load time, before any instances
//        of the class are constructed (and before any static methods are called from elsewhere).
//        That way you can make sure that the class resources are all ready to use.
        System.out.println("Initializing... Static Initializer is run!");
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
