import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
}
