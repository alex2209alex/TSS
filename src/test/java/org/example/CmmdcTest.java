package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CmmdcTest {
    @Test
    void C_1() {
        Assertions.assertEquals(1, Cmmdc.calculeazaCmmdc(6, 7));
    }

    @Test
    void C_2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(-100, -100));
    }

    @Test
    void C_3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(-100, 7));
    }

    @Test
    void C_4() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(-100, 100));
    }

    @Test
    void C_5() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(6, -100));
    }

    @Test
    void C_6() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(6, 100));
    }

    @Test
    void C_7() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(100, -100));
    }

    @Test
    void C_8() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(100, 7));
    }

    @Test
    void C_9() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(100, 100));
    }
}