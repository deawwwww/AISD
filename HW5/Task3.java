import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int left = 0;
        int right = arr.length - 1;
        Scanner sc = new Scanner(System.in);
        int need = sc.nextInt();
        if (arr[right] * 2 < need) {
            System.out.println("nety");
            return;
        } else if (arr[left] * 2 > need) {
            System.out.println("nety");
            return;
        }
        while(arr[left] + arr[right] != need) {
            if (arr[left] + arr[right] > need) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println(arr[right] + " + " + arr[left]);
    }
}