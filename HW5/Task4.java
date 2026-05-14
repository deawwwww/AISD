import java.util.Arrays;
import java.util.Comparator;

public class Task4 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 30, 34, 5, 9};
        String[] arr = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}