import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PascalsTriangle pt = new PascalsTriangle();
        
        System.out.print("Enter exponent: ");
        int N = scanner.nextInt();
        
        pt.printTriangle(N);
    }
}