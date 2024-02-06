import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        n = sc.nextInt();

        String result = n % 2 == 1 ? "Odd" : "Even";

        System.out.println(result);

        sc.close();

    }
}
