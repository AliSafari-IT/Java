package training;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OliveTest {
    private Olive[] olives = new Olive[3];

    @Test
    void case1() {
        Olive o1 = new Olive("Kalamata", 0x000000);
        olives[0] = o1;
        System.out.println(o1);
        Olive o2 = new Olive("Picholine", 0x00FF00);
        olives[1] = o2;
        System.out.println(o2);
        Olive o3 = new Olive("Ligurio", 0x000000);
        olives[2] = o3;
        System.out.println(o3);
        System.out.println(Arrays.toString(olives));
        assertEquals("Kalamata",olives[0].oliveName);
    }

    @Test
    void case2() {


    }

    @Test
    void case3() {

    }
}