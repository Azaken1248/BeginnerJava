import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number Factorial: ");
        n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " is " + fact);

        sc.close();
    }
}
