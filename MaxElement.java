import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        int size;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Of Array: ");
        size = sc.nextInt();

        int arr[] = new int[size];

        // insert elements
        for (int i = 0; i < size; i++) {
            int element;
            System.out.print("Enter \'" + i + "\' Element: ");
            element = sc.nextInt();
            arr[i] = element;
        }

        // find max
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The Max Element Is: " + max);

        sc.close();
    }
}
