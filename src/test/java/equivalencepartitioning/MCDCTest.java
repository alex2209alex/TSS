package equivalencepartitioning;

import org.example.Cmmdc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MCDCTest {
    // Conditia 15 a <= 0 || b <= 0
    // false true
    // true false
    // false false

    @Test
    void t1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(10, 0));
    }

    @Test
    void t2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(0, 10));
    }

    // Testele de mai jos acopera conditia false false

    // Conditia 18 a > 10 || b > 10
    // false true
    // true false
    // false false

    @Test
    void t3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(8, 11));
    }

    @Test
    void t4() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(11, 8));
    }

    // Testele de mai jos acopera conditia false false

    // Conditia 21 a < b
    // true
    // false

    @Test
    void t5() {
        Assertions.assertEquals(4, Cmmdc.calculeazaCmmdc(4, 8));
    }

    @Test
    void t6() {
        Assertions.assertEquals(4, Cmmdc.calculeazaCmmdc(8, 4));
    }

    // Conditia 27 r != 0
    // true
    // false

    @Test
    void t7() {
        Assertions.assertEquals(1, Cmmdc.calculeazaCmmdc(8, 7));
    }

    @Test
    void t8() {
        Assertions.assertEquals(5, Cmmdc.calculeazaCmmdc(5, 5));
    }
}
