package problem001;

import java.util.concurrent.*;

public class MultiplesOf3And5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Integer> sumMultiplesOf3 = () -> {
            int sum = 0;
            for (int i = 3; i < 1000; i += 3) {
                sum += i;
            }

            return sum;
        };

        Callable<Integer> sumMultiplesOf5 = () -> {
            int sum = 0;
            for(int i = 5; i < 1000; i += 5) {
                if(i % 3 != 0) sum += i;
            }

            return sum;
        };

        Future<Integer> future3 = executorService.submit(sumMultiplesOf3);
        Future<Integer> future5 = executorService.submit(sumMultiplesOf5);

        int wholeSum = future3.get() + future5.get();

        System.out.println(future3.get() + " + " + future5.get() + " = " + wholeSum);

        executorService.shutdown();
    }
}
