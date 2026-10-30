import java.util.Scanner;
public class Ex5 {
    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = input.nextInt();
        System.out.println();
        System.out.println("Output:");
        System.out.print("All prime numbers from 2 to " + n + ": ");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        input.close();
    }
}