import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Enter c: ");
        c = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("There are infinite solutions");
                } else {
                    System.out.println("No solution");
                }
            } else {
                double x = (double) -c / b;
                System.out.println("The value of x is: " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
                System.out.println("There are two real solutions");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2.0 * a);
                System.out.println("There is one real solution");
                System.out.println("x = " + x);
            } else {
                System.out.println("There are no real roots");
            }
        }
    }
}