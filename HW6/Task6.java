import java.util.HashSet;
import java.util.Set;

public class Task6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        int[] arr3 = {9, 10, 4, 11, 12};

        Integer common = findFirstCommon(arr1, arr2, arr3);

        if (common != null) {
            System.out.println("общий элемент: " + common);
        } else {
            System.out.println("общих элементов не найдено");
        }
    }

    public static Integer findFirstCommon(int[] first, int[] second, int[] third) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int num : first) {
            setA.add(num);
        }
        for (int num : second) {
            setB.add(num);
        }
        for (int num : third) {
            if (setA.contains(num) && setB.contains(num)) {
                return num;
            }
        }
        return null;
    }
}