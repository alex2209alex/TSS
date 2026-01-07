package equivalencepartitioning;

import org.example.CmmdcNeechivalentNeprins;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MCNeechivalentNeprinsTest {
    @Test
    void t1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> CmmdcNeechivalentNeprins.calculeazaCmmdc(10, 0));
    }

    @Test
    void t2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> CmmdcNeechivalentNeprins.calculeazaCmmdc(0, 10));
    }

    @Test
    void t3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> CmmdcNeechivalentNeprins.calculeazaCmmdc(8, 11));
    }

    @Test
    void t4() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> CmmdcNeechivalentNeprins.calculeazaCmmdc(11, 8));
    }

    @Test
    void t5() {
        Assertions.assertEquals(4, CmmdcNeechivalentNeprins.calculeazaCmmdc(4, 8));
    }

    @Test
    void t6() {
        Assertions.assertEquals(4, CmmdcNeechivalentNeprins.calculeazaCmmdc(8, 4));
    }

    @Test
    void t7() {
        Assertions.assertEquals(1, CmmdcNeechivalentNeprins.calculeazaCmmdc(8, 7));
    }

    @Test
    void t8() {
        Assertions.assertEquals(5, CmmdcNeechivalentNeprins.calculeazaCmmdc(5, 5));
    }
}
