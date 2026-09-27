import java.util.Arrays;

public class PascalsTriangle {

    private int factorial(int n) {
        int res = 1;
        for (int i = 2; i < n + 1; i++) {
            res *= i;
        }
        return res;
    }

    public void printTriangle(int exponent) {
        for (int n = 0; n < exponent + 1; n++) {
            int[] row = new int[n+1];
            for (int k = 0; k < n + 1; k++) {
                row[k] = factorial(n)/(factorial(k) * factorial(n - k));
            }
            System.out.println(Arrays.toString(row));
        }
    }
}