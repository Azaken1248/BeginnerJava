import java.util.Arrays;

public class Reverse {
    public static void reverseArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            // Swap the elements at the left and right indices
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            // Move the pointers towards the middle
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int Arr[] = { 5, 3, 1, 2, 9, 8, 6, 5, 7 };
        reverseArray(Arr);
        System.out.println(Arrays.toString(Arr));
    }
}
