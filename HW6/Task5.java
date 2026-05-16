public class Task5 {
    public static void main(String[] args) {
        int[] nums = {2, 4, 8, 11, 13, 23, 31, 44};
        int target = 19;
        System.out.println("Ближайшая сумма трёх чисел " + closestSum(nums, target));
    }

    public static int closestSum(int[] arr, int target) {
        int length = arr.length;
        int best = arr[0] + arr[1] + arr[2];

        for (int i = 0; i < length - 2; i++) {
            int left = i + 1;
            int right = length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    return sum;
                }
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return best;
    }
}