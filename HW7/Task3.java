import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        int f1 = 1;
        int f2 = 1;
        if (s.length() >= 1) {
            result = result + s.charAt(0);
        }

        while (true) {
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
            if (next > s.length()) {
                break;
            }
            result = result + s.charAt(next - 1);
        }
        System.out.println(result);
    }
}