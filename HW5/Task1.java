import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {
        int[] values = {3, 7, 1, 9, 4};
        int target = 10;
        HashSet<Integer> hashSet = new HashSet<>();

        for (int x : values) {
            int y = target - x;
            if (hashSet.contains(y)) {
                System.out.println(x + " + " + y + " = " + target);
                return;
            }
            hashSet.add(x);
        }
        System.err.println("подходящей пары нету");
    }
}