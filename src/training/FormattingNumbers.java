package training;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class FormattingNumbers {

    public static void main(String[] args) {

        Olive o1 = new Olive("Kalamata", 0x000000);
        Olive o2 = new Olive("Picholine", 0x00FF00);
        Olive o3 = new Olive("Ligurio", 0x000000);

        Olive[] olives = {o1, o2, o3};
        System.out.println(Arrays.toString(olives));

        int OliveNumbers = 100_000_0;
        String format = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(OliveNumbers);
        System.out.println("Without NumberFormat: \t"+OliveNumbers);
        System.out.println("With NumberFormat: \t\t"+format);
    }
}
