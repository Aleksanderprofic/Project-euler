package problem3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LargestPrimeFactor {
    private static Set<Long> primeFactors = new TreeSet<>();

    public static long nextPrimeNumber(long number) {
        boolean found = false;
        if(number == 2) number = 1;
        Long primeFactor;
        Iterator<Long> it;

        while(!found) {
            number += 2;
            found = true;
            long halfOfNumber = number/2;

            it = primeFactors.iterator();

            while(it.hasNext()) {
                primeFactor = it.next();
                if(primeFactor > halfOfNumber) break;
                if(number % primeFactor == 0) {
                    found = false;
                    break;
                }
            }
        }

        primeFactors.add(number);

        return number;
    }

    private static long findLargestPrimeFactor(long number) {
        long primeFactor = 2;
        while(number != 1) {
            if(number % primeFactor == 0) {
                number /= primeFactor;
            }
            else primeFactor = nextPrimeNumber(primeFactor);
        }

        return primeFactor;
    }

    public static void main(String[] args) {
        System.out.println(findLargestPrimeFactor(600851475143L));
    }
}
