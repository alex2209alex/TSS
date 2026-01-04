package equivalencepartitioning;

import org.example.Cmmdc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/// Boundary Value Analysis
/*
Intrari
• Un numar intreg a
• Un numar intreg b

Domeniul de intrari
• a trebuie sa fie intre 1 si 10, deci se disting 3 clase de echivalenta
A_1 = 1 ... 10 => 1, 10 valori de frontiera si o valuare din interior
A_2 = { a | a < 1 } => 0 valoare de frontiera si o valuare din interior
A_3 = { a | a > 10 } => 11 valoare de frontiera si o valuare din interior

• b trebuie sa fie intre 1 si 10, deci se disting 3 clase de echivalenta
B_1 = 1 ... 10 => 1, 10 valori de frontiera si o valuare din interior
B_2 = { b | b < 1 } => 0 valoare de frontiera si o valuare din interior
B_3 = { b | b > 10 } => 11 valoare de frontiera si o valuare din interior

Iesiri
• Cel mai mare divizor comun daca datele de intrare sunt valide
• O eroare in cazul in care datele de intrare sunt invalide

Acestea sunt folosite pentru a imparti domeniul de intrare in 2 clase: una pentru cazul in care a si b sunt valide si
una pentru cand a sau b este invalid
• C_1(a, b) = { (a, b) | 1 <= a <= 10, 1 <= b <= 10 } => nu exista frontiere clare
• C_2(a, b) = { (a, b) | a si b nu respecta 1 <= a <= 10 sau 1 <= b <= 10 } nu exista frontiere clare

Clase de echivalenta
• C_11 = { (a, b) | a in A_1, b in B_1}
• C_12 = { (a, b) | a in A_1, b in B_2}
• C_13 = { (a, b) | a in A_1, b in B_3}
• C_2 = { (a, b) | a in A_2}
• C_3 = { (a, b) | a in A_3}

Date de test
• C_11 : (1, 1), (10, 1), (9, 1), (1, 10), (10, 10), (9, 10), (1, 6), (10, 6), (9, 6)
• C_12 : (1, 0), (10, 0), (9, 0), (1, -100), (10, -100), (9, -100)
• C_13 : (1, 11), (10, 11), (9, 11), (1, 100), (10, 100), (9, 100)
• C_2 : (0, _), (-100, _)
• C_3 : (11, _), (100, _)

Are acoperire 100%. Prin alegerea si combinarea valorilor de boundary se testeaza si cazul (10, 1) care acopera linile
neacoperite cu equivalence partitioning.
*/

class BoundaryValueAnalysisTest {
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
