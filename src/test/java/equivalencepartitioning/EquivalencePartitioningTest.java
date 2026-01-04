package equivalencepartitioning;

import org.example.Cmmdc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/// Equivalence partitioning
/*
Intrari
• Un numar intreg a
• Un numar intreg b

Domeniul de intrari
• a trebuie sa fie intre 1 si 10, deci se disting 3 clase de echivalenta
A_1 = 1 ... 10
A_2 = { a | a < 1 }
A_3 = { a | a > 10 }

• b trebuie sa fie intre 1 si 10, deci se disting 3 clase de echivalenta
B_1 = 1 ... 10
B_2 = { b | b < 1 }
B_3 = { b | b > 10 }

Iesiri
• Cel mai mare divizor comun daca datele de intrare sunt valide
• O eroare in cazul in care datele de intrare sunt invalide

Acestea sunt folosite pentru a imparti domeniul de intrare in 2 clase: una pentru cazul in care a si b sunt valide si
una pentru cand a sau b este invalid
• C_1(a, b) = { (a, b) | 1 <= a <= 10, 1 <= b <= 10 }
• C_2(a, b) = { (a, b) | a si b nu respecta 1 <= a <= 10 sau 1 <= b <= 10 }

Clase de echivalenta
• C_11 = { (a, b) | a in A_1, b in B_1}
• C_12 = { (a, b) | a in A_1, b in B_2}
• C_13 = { (a, b) | a in A_1, b in B_3}
• C_2 = { (a, b) | a in A_2}
• C_3 = { (a, b) | a in A_3}

Date de test
• C_11 : (9, 6)
• C_12 : (9, -100)
• C_13 : (9, 100)
• C_2 : (-100, _)
• C_3 : (100, _)

Are acoperire 78 % deoarece crearea unui singur test pentru fiecare clasa de echivalenta nu creaza necesitatea
existentei unui test in care a < b. Se putea ajunge la 100% daca la C_11 alegeam (6, 9) ca input
*/

class EquivalencePartitioningTest {
    @Test
    void C_11() {
        Assertions.assertEquals(3, Cmmdc.calculeazaCmmdc(9, 6));
    }

    @Test
    void C_12() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(9, -100));
    }

    @Test
    void C_13() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(9, 100));
    }

    @Test
    void C_2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(-100, 8));
    }

    @Test
    void C_3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Cmmdc.calculeazaCmmdc(100, 8));
    }
}
