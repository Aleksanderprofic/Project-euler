package problem10;

import java.util.Set;
import java.util.TreeSet;

public class SummationOfPrimes {
    private static Set<Long> primeNumbers = new TreeSet<>();

    private static long sumOfPrimeNumbers() {
        long sum = 2;
        long toNumber = 2000000;
        long actualNumber = 3;

        while(actualNumber < toNumber) {
            boolean found = true;
            long halfOfNumber = actualNumber/2;

            for(Long primeFactor: primeNumbers) {
                if(primeFactor > halfOfNumber) break;
                if(actualNumber % primeFactor == 0) {
                    found = false;
                    break;
                }
            }

            if(found) {
                sum += actualNumber;
                primeNumbers.add(actualNumber);
            }

            actualNumber += 2;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfPrimeNumbers());
    }
}
