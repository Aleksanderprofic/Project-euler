package problem6;

public class SumSquareDifference {
    public static void main(String[] args) {
        int size = 100;

        long sumOfTheSquares = 0, squareOfTheSum = ((1+size)*size/2) * ((1+size)*size/2);
        int difference = 3, toAdd = 1;

        for(int i = 0; i < size; i++, difference += 2) {
            sumOfTheSquares += toAdd;
            toAdd += difference;
        }

        System.out.println(computeDifference(sumOfTheSquares, squareOfTheSum));
    }

    private static long computeDifference(long sumOfTheSquares, long squareOfTheSum) {
        return Math.abs(sumOfTheSquares - squareOfTheSum);
    }
}
