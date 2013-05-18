package palindrome;

import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {

    public PalindromeTest() {
    }

    @Test
    public void DecimalPalindrome() {
        assertTrue(Palindrome.Palindromo(1234321, 10));
        assertTrue(Palindrome.Palindromo(9, 10));
        assertFalse(Palindrome.Palindromo(785, 10));
        assertFalse(Palindrome.Palindromo(1210, 10));
        assertFalse(Palindrome.Palindromo(01210, 10));
    }

    @Test
    public void OctalPalindrome() {
        assertFalse(Palindrome.Palindromo(273, 8));
    }

    @Test
    public void HexadecimalPalindrome() {
        assertFalse(Palindrome.Palindromo(1234321, 16));
        assertTrue(Palindrome.Palindromo(289, 16));
        assertTrue(Palindrome.Palindromo(273, 16));
    }

    @Test
    public void BinaryPalindrome() {
        assertFalse(Palindrome.Palindromo(1234, 2));
        assertTrue(Palindrome.Palindromo(273, 2));
    }
}
