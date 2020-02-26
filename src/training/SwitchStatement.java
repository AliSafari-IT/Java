package training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SwitchStatement {
    public static void main(String[] args) {
        Random rndGenerator = new Random();

        int randomNr = rndGenerator.nextInt(3);

        Olive o1 = new Olive("Kalamata", 0x000000);
        Olive o2 = new Olive("Picholine", 0x00FF00);
        Olive o3 = new Olive("Ligurio", 0x000000);

        Olive[] olives = {o1, o2, o3};
        ArrayList<Olive> arrayList = new ArrayList<>(Arrays.asList(olives));

        Olive olive = arrayList.get(randomNr);

        switch (olive.getOliveName()){
            case "Kalamata":
                System.out.println("It's greek olive!");
                break;
            case "Picholine":
                System.out.println("It's french olive!");
                break;
            case "Ligurio":
                System.out.println("It's italian olive!");
                break;
        }
    }

}
