package cycle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CycleTest {
   Cycle check = new Cycle();

    @Test
    void cycleTestTrue() {
        String str1 = "ABCD";
        String str2 = "DABC";

        assertTrue(Cycle.isCycle(str1, str2));
    }

    @Test
    void cycleTestFalse() {
        String str1 = "ABCD";
        String str2 = "ACDB";
        assertFalse(Cycle.isCycle(str1, str2));
    }
}
