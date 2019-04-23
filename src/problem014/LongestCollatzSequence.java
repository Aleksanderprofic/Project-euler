package problem014;

import java.util.HashMap;
import java.util.Map;

public class LongestCollatzSequence {
    private static Map<Long, Long> numbers = new HashMap<>();

    public static void main(String[] args) {
        long longestChain = 1, numberWithLongestChain = -1;
        for(long i = 2; i < 1000000; i++) {
            long temp;

            if((temp = runSequence(i)) > longestChain) {
                longestChain = temp;
                numberWithLongestChain = i;
            }
        }

        System.out.println(numberWithLongestChain);
    }

    private static long runSequence(long startingNumber) {
        long length = 0;
        long i = startingNumber;

        while(i != 1) {
            if(numbers.containsKey(i)) {
                length += numbers.get(i) - 1;
                break;
            }

            length++;
            if(i % 2 == 0) {
                i = i / 2;
            } else {
                i = (3*i + 1);
            }
        }
        length++;

        numbers.put(startingNumber, length);
        return length;
    }
}
