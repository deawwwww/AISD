import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] arr2 = new int[n][m];
        arr2[0][0] = arr[0][0];
        for (int j = 1; j < m; j++) {
            arr2[0][j] = arr2[0][j - 1] + arr[0][j];
        }
        for (int i = 1; i < n; i++) {
            arr2[i][0] = arr2[i - 1][0] + arr[i][0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                arr2[i][j] = arr[i][j] + Math.min(arr2[i - 1][j], arr2[i][j - 1]);
            }
        }
        System.out.println(arr2[n - 1][m - 1]);
    }
}