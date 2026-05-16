public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 5, 7, 9, 10};
        int target = 8;
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                index = i;
                System.out.println(index);
                break;
            }
        }
    }
}