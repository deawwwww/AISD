public class Task2 {
    public static void main(String[] args) {
        int first = 12;
        int second = 144;

        System.out.println(first * first == second);
        System.out.println(sqrt(first, first) == second);
    }

    public static long sqrt(int a, int b) {
        int result = 0;
        int x = Math.abs(a);
        int y = Math.abs(b);
        while (x != 0) {
            if ((x & 1) == 1) {
                result += y;
            }
            x >>= 1;
            y <<= 1;
        }
        return result;
    }
}