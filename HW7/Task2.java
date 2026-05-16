import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("0");
            return;
        }
        int f1 = 0;
        int f2 = 1;
        for (int i = 2; i <= n; i++) {
            int next = (f1 + f2) % 10;
            f1 = f2;
            f2 = next;
        }
        System.out.println("последняя цифра " + f2);
    }
}