package palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {
    Palindrome check = new Palindrome();

    @Test
    void palindromeTestTrue() {
        String str = "redivider";
        assertTrue(Palindrome.isPal(str));
    }

    @Test
    void palindromeTest2True() {
        String str = "do geese see god";
        assertTrue(Palindrome.isPal(str));
    }

    @Test
    void palindromeTestFalse() {
        String str = "Was it a car or a cat I saw";
        assertFalse(Palindrome.isPal(str));
    }
}
