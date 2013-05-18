package palindrome;

public class Palindrome {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static Boolean isPalindrome(Integer number){        
        String numbers = number.toString();
        for(int index=0; index < (numbers.length())/2; index++){
            if (numbers.charAt(index) != numbers.charAt(numbers.length()-1-index)) return false; 
        }
        return true;
    }
    
}
