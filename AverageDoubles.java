import java.util.Scanner;

public class AverageDoubles {
    public static void main(String[] args) {
        int size;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Of Array: ");
        size = sc.nextInt();

        double arr[] = new double[size];

        // insert elements
        for (int i = 0; i < size; i++) {
            double element;
            System.out.print("Enter \'" + i + "\' Element: ");
            element = sc.nextDouble();
            arr[i] = element;
        }

        // find avg
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = ((sum) / (arr.length));

        System.out.println("The Avg Is: " + avg);

        sc.close();
    }
}
