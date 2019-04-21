package problem004;

public class LargestPalindrome {
    public static void main(String[] args) {
        System.out.println(findLargestPalindrome());
    }

    private static int findLargestPalindrome() {
        int largestPalindrome = 0;

        for(int i = 100; i < 1000; i++) {
            for(int j = i; j < 1000; j++) {
                if(isPalindrome(i*j) && i*j > largestPalindrome) largestPalindrome = i*j;
            }
        }

        return largestPalindrome;
    }

    private static boolean isPalindrome(Integer number) {
        String stringNumber = number.toString();

        int i = 0, j = stringNumber.length() - 1;

        while(i < j) {
            if(stringNumber.charAt(i) != stringNumber.charAt(j)) return false;
            i++; j--;
        }

        return true;
    }
}
