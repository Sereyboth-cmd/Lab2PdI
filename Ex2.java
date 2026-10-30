import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter a number");
        number = sc.nextInt();
        int sum=0;
        int count=0;
        for(int i = 1000; i>=number; i--){
        sum +=i;
        count++;
        }
        Double Avg = (count > 0) ? (double) sum/count : 0.0;
        System.out.println("sum is: " +sum);
        System.out.println("average is: " +Avg);
        sc.close();
    }
}