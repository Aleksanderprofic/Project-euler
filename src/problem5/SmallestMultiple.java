package problem5;


import problem3.LargestPrimeFactor;

public class SmallestMultiple {

    public static void main(String[] args) {
        System.out.println(findSmallestMultiple(20));
    }

    private static long findSmallestMultiple(int toNumber) {
        long productOfPrimeNumbers = 2;
        long primeNumber = 2;

        while((primeNumber = LargestPrimeFactor.nextPrimeNumber(primeNumber)) <= toNumber) {
            productOfPrimeNumbers *= primeNumber;
        }

        long smallestMultiple = productOfPrimeNumbers;

        while(true) {
            int i;
            for(i = 2; i <= toNumber; i++) {
                if(smallestMultiple % i != 0) break;
            }

            if(i == toNumber + 1) break;

            smallestMultiple += productOfPrimeNumbers;
        }

        return smallestMultiple;
    }
}
