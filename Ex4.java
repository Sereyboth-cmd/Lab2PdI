import java.util.Scanner;
public class Ex4 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        String name, major;
        int year;
        float expected_GPA;
        System.out.println("Input Name: ");
        name = input.nextLine();
        System.out.println("Input your Major");
        major = input.nextLine();
        System.out.println("Input your year: ");
        year = input.nextInt();
        System.out.println("What's your expected GPA?");
        expected_GPA = input.nextFloat();
        System.out.println("\nHi," +name + " you are in year " +year+ " majoring in "+major+
        "\nYour expected GPA is: "+expected_GPA );
        input.close();
    }
}
