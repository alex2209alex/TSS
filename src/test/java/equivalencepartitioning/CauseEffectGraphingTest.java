package equivalencepartitioning;

import org.example.Cmmdc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/// Cause Effect Graphing
/*
Cauze
• C1: a < 1
• C2: 1 <= a <= 10
• C3: a > 10
• C4: b < 1
• C5: 1 <= b <= 10
• C6: b > 10

Efecte
• Ef1: Returnare cmmdc
• Ef2: Eroare

Cazuri de testare
Coloana 1: (6, 7)
Coloana 2: (-100, -100)
Coloana 3: (-100, 7)
Coloana 4: (-100, 100)
Coloana 5: (6, -100)
Coloana 6: (6, 100)
Coloana 7: (100, -100)
Coloana 8: (100, 7)
Coloana 9: (100, 100)

Are acoperire pe branchuri de 91 la suta deoarece testele sunt bazate pe specificatii. Coloana 1 avand un singur exemplu
nu acopera si cazul cand a >= b.
In ansamblu testele bazandu-se doar pe specificatii, neluand in calcul implementarea, nu o sa asigure o acoperire de
100% a programului. Aici fiind si un algoritm mai simplu acoperirea pentru algoritmi mai complexi ar trebui sa fie si mai
mica decat cea obtinuta prntru programul curent.
*/

class CauseEffectGraphingTest {
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
