package equivalencepartitioning;

import org.example.CmmdcNeechivalentPrins;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MCNeechivalentPrinsTest {
    @Test
    void t1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> CmmdcNeechivalentPrins.calculeazaCmmdc(10, 0));
    }

    @Test
    void t2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> CmmdcNeechivalentPrins.calculeazaCmmdc(0, 10));
    }

    @Test
    void t3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> CmmdcNeechivalentPrins.calculeazaCmmdc(8, 11));
    }

    @Test
    void t4() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> CmmdcNeechivalentPrins.calculeazaCmmdc(11, 8));
    }

    @Test
    void t5() {
        Assertions.assertEquals(4, CmmdcNeechivalentPrins.calculeazaCmmdc(4, 8));
    }

    @Test
    void t6() {
        Assertions.assertEquals(4, CmmdcNeechivalentPrins.calculeazaCmmdc(8, 4));
    }

    @Test
    void t7() { // Actual -13395661
        Assertions.assertEquals(1, CmmdcNeechivalentPrins.calculeazaCmmdc(8, 7));
    }

    @Test
    void t8() {
        Assertions.assertEquals(5, CmmdcNeechivalentPrins.calculeazaCmmdc(5, 5));
    }
}
