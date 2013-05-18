/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import org.junit.Test;
import static org.junit.Assert.*;


public class PalindromeTest {
    
    public PalindromeTest() {
    }
    
    
    @Test
    public void testMain() {
        assertTrue(Palindrome.isPalindrome(1234321));
        assertTrue(Palindrome.isPalindrome(9));
        assertFalse(Palindrome.isPalindrome(785));
        assertFalse(Palindrome.isPalindrome(1210));
        assertFalse(Palindrome.isPalindrome(01210));
    }
}
