package palindrome;

public class Palindrome {

    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static Boolean Palindromo(Integer number, Integer base) {
        String numbers = convertToBase(number, base);
        for (int index = 0; index < (numbers.length()) / 2; index++) {
            if (numbers.charAt(index) != numbers.charAt(numbers.length() - 1 - index)) {
                return false;
            }
        }
        return true;
    }

    private static String convertToBase(Integer number, Integer base) {
        if (base == 16) {

            return Integer.toHexString(number);
        } else if (base == 8) {
            return Integer.toOctalString(number);
        } else if (base == 2) {
            return Integer.toBinaryString(number);
        }
        return Integer.toString(number);
    }
}
