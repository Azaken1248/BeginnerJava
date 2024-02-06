import java.util.Arrays;

public class Sorter {
    public static void main(String[] args) {
        int Arr[] = { 5, 3, 1, 2, 9, 8, 6, 5, 7 };

        for (int i = 0; i < Arr.length - 1; i++) {
            for (int j = 0; j < Arr.length - i - 1; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    int temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(Arr));
    }
}
