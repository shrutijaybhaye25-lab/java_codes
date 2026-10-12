import java.util.Scanner;
public class Q4PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        printFactors(number);
        scanner.close();
    }
    public static void printFactors(int n) {
        if (n < 1) {
            System.out.println("Invalid input. Please enter a number greater than or equal to 1.");
            return;
        }
        if (n == 1) {
            System.out.println("Prime factorization: 1");
            return;
        }
        System.out.print("Prime factorization: ");
        boolean isFirst = true;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                int count = 0;
                while (n % i == 0) {
                    count++;
                    n /= i;
                }
                if (!isFirst) {
                    System.out.print(" x ");
                }
                System.out.print(i + "^" + count);
                isFirst = false;
            }
        }
        System.out.println();
    }
}
