package numbers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersTest {
    Numbers numbers = new Numbers();

    @Test
    void checkSquareCount(){
        int a = 17;
        int b = 122;
        assertEquals(7, numbers.squaresInInterval(a, b));
    }

    @Test
    void checkMultiplyCount(){
        int a = 1;
        int b = 20;
        assertEquals(4, numbers.valuesInInterval(a,b));
    }

}
