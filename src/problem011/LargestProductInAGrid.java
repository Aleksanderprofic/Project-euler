package problem011;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LargestProductInAGrid {
    private static int size = 20;
    private static int[][] table = new int[size][size];
    private static int i, j;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("/Users/profitz/Documents/github/Project-euler/src/problem011/data.dat"));

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                table[i][j] = scanner.nextInt();
            }
        }

        System.out.println(computeLargestProduct());
    }

    private static long computeLargestProduct() {
        long actualProduct, largestProduct = 0;

        for(i = 0; i < size; i++) {
            for(j = 0; j < size - 3; j++) {
                if(i >= 3 && (actualProduct = computeUpRight()) > largestProduct)
                    largestProduct = actualProduct;

                if(i < size - 3) {
                    long temp;
                    temp = computeDown();
                    actualProduct = computeDownRight();

                    if(temp > largestProduct)
                        largestProduct = temp;

                    if(actualProduct > largestProduct)
                        largestProduct = actualProduct;
                }

                if((actualProduct = computeRight()) > largestProduct)
                    largestProduct = actualProduct;
            }
        }

        return largestProduct;
    }

    private static long computeUpRight() {
        long product = 1;
        int i_ = i, j_ = j;

        for(int k = 0; k < 4; k++, i_--, j_++) {
            product *= table[i_][j_];
        }

        return product;
    }

    private static long computeRight() {
        long product = 1;
        int j_ = j;

        for(int k = 0; k < 4; k++, j_++) {
            product *= table[i][j_];
        }

        return product;
    }

    private static long computeDownRight() {
        long product = 1;
        int i_ = i, j_ = j;

        for(int k = 0; k < 4; k++, i_++, j_++) {
            product *= table[i_][j_];
        }

        return product;
    }

    private static long computeDown() {
        long product = 1;
        int i_ = i;

        for(int k = 0; k < 4; k++, i_++) {
            product *= table[i_][j];
        }

        return product;
    }
}
