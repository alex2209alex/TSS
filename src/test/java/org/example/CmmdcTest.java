package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CmmdcTest {
    @Test
    void C_11_1() {
        Assertions.assertEquals(1, Cmmdc.calculeazaCmmdc(1, 1));
    }

    @Test
    void C_11_2() {
        Assertions.assertEquals(1, Cmmdc.calculeazaCmmdc(10, 1));
    }

    @Test
    void C_11_3() {
        Assertions.assertEquals(1, Cmmdc.calculeazaCmmdc(9, 1));
    }

    @Test
    void C_11_4() {
        Assertions.assertEquals(1, Cmmdc.calculeazaCmmdc(1, 10));
    }

    @Test
    void C_11_5() {
        Assertions.assertEquals(10, Cmmdc.calculeazaCmmdc(10, 10));
    }

    @Test
    void C_11_6() {
        Assertions.assertEquals(1, Cmmdc.calculeazaCmmdc(9, 10));
    }

    @Test
    void C_11_7() {
        Assertions.assertEquals(1, Cmmdc.calculeazaCmmdc(1, 6));
    }

    @Test
    void C_11_8() {
        Assertions.assertEquals(2, Cmmdc.calculeazaCmmdc(10, 6));
    }

    @Test
    void C_11_9() {
        Assertions.assertEquals(3, Cmmdc.calculeazaCmmdc(9, 6));
    }

    @Test
    void C_12_1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(1, 0));
    }

    @Test
    void C_12_2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(10, 0));
    }

    @Test
    void C_12_3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(9, 0));
    }

    @Test
    void C_12_4() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(1, -100));
    }

    @Test
    void C_12_5() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(10, -100));
    }

    @Test
    void C_12_6() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(9, -100));
    }

    @Test
    void C_13_1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(1, 11));
    }

    @Test
    void C_13_2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(10, 11));
    }

    @Test
    void C_13_3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(9, 11));
    }

    @Test
    void C_13_4() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(1, 100));
    }

    @Test
    void C_13_5() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(10, 100));
    }

    @Test
    void C_13_6() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(9, 100));
    }

    @Test
    void C_2_1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(0, 9));
    }

    @Test
    void C_2_2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(-100, 9));
    }

    @Test
    void C_3_1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(11, 9));
    }

    @Test
    void C_3_2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(100, 9));
    }
}