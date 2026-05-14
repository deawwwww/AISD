public class Task2 {
    public static void main(String[] args) {
        int[] digits = {0, 1, 2, 3, 5, 6, 4, 8, 9};
        int n = digits.length;
        int expected = 0;
        int actual = 0;

        for (int i = 0; i <= n; i++) {
            expected += i;
        }
        for (int num : digits) {
            actual += num;
        }
        System.out.println(expected - actual);
    }
}
