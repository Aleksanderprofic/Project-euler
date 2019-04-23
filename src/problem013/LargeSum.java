package problem013;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LargeSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/profitz/Documents/github/Project-euler/src/problem013/data.txt"));
        int[] sum = new int[52];
        String s;

        while((s = br.readLine()) != null) {
            for(int i = 49; i >= 0; i--) {

                if((sum[i+2] += s.charAt(i) - '0') >= 10) {
                    sum[i+1] += sum[i+2] / 10;
                    sum[i+2] %= 10;
                }
            }
        }

        if(sum[1] >= 10) {
            sum[0] += sum[1] / 10;
            sum[1] %= 10;
        }

        for(int i = 0; i < 10; i++) {
            System.out.print(sum[i]);
        }
    }
}
