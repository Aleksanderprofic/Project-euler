package problem007;

import problem003.LargestPrimeFactor;

public class Prime {
    public static void main(String[] args) {
        long primeNumber = 2;

        for(int i = 2; i <= 10001; i++) {
            primeNumber = LargestPrimeFactor.nextPrimeNumber(primeNumber);
        }

        System.out.println(primeNumber);
    }
}
