package problem2;

public class Fibonacci {
    public static int sumOfEvenValues(int toNumber) {
        int firstNumber = 1;
        int secondNumber = 2;
        int sumOfEvenValues = 0;

        while(secondNumber <= toNumber) {
            if(secondNumber % 2 == 0)
                sumOfEvenValues += secondNumber;

            int temp = secondNumber;
            secondNumber += firstNumber;

            firstNumber = temp;
        }

        return sumOfEvenValues;
    }

    public static void main(String[] args) {
        System.out.println(sumOfEvenValues(4000000));
    }
}