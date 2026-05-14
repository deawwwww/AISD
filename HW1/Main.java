public class Main {
    public static void main(String[] args) {
        System.out.println(gcd(15,20));
    }
    public static int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}