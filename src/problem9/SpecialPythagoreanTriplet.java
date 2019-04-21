package problem9;

public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {

        System.out.println(computeTheProduct());
    }

    private static long computeTheProduct() {
        for(int a = 1; a < 333; a++) {
            int c = a + 2;
            for(int b = a+1; b < c; b++) {
                c = 1000 - b - a;

                if(a*a + b*b == c*c) return a*b*c;
            }
        }

        return 0;
    }
}
