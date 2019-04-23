package problem012;

public class HighlyDivisibleTriangularNumber {
    public static void main(String[] args) {
        System.out.println(overFiveHundredDivisors());
    }

    private static int i = 2;

    private static long overFiveHundredDivisors() {

        long actualNumber = goFurther(500);
        boolean found = false;

        int howManyDivisors;

        while(!found) {
            howManyDivisors = 2;
            actualNumber += i;

            long sqrtOfNumber = (long)Math.sqrt(actualNumber);
            int j;

            for(j = 2; j < sqrtOfNumber; j++) {
                if(actualNumber % j == 0) {
                    howManyDivisors += 2;
                }
            }

            if(howManyDivisors > 500) {
                found = true;
            }

            i++;
        }

        return actualNumber;
    }

    private static long goFurther(int howManyDivisors) {
        int toNumber = (howManyDivisors/2)*(howManyDivisors/2);
        long actualNumber = 0;

        for(i = 1; actualNumber < toNumber; i++) {
            actualNumber += i;
        }

        return actualNumber;
    }
}