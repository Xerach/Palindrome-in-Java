package palindrome;

import org.junit.Test;
import static org.junit.Assert.*;


public class PalindromeTest {
    
    public PalindromeTest() {
    }
        
    @Test
    public void DecimalPalindrome() {
        assertTrue(Palindrome.isPalindrome(1234321,10));
        assertTrue(Palindrome.isPalindrome(9,10));
        assertFalse(Palindrome.isPalindrome(785,10));
        assertFalse(Palindrome.isPalindrome(1210,10));
        assertFalse(Palindrome.isPalindrome(01210,10));
    }
    
    @Test
    public void OctalPalindrome() {
        assertFalse(Palindrome.isPalindrome(273,8));
    }
    
    @Test
    public void HexadecimalPalindrome() {
        assertFalse(Palindrome.isPalindrome(1234321,16));
        assertTrue(Palindrome.isPalindrome(289,16));
        assertTrue(Palindrome.isPalindrome(272,16));
    }
    
    @Test
    public void BinaryPalindrome() {
        assertFalse(Palindrome.isPalindrome(1234,2));
        assertTrue(Palindrome.isPalindrome(273,2));
    }
}
