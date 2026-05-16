import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int f1 = 0;
        int f2 = 1;
        while (f2 < a) {
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        System.out.println(f2 == a);
    }
}