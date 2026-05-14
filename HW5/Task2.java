import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static List<String> compareString(String[] array) {
        List<String> list = new ArrayList<>();
        for (String word : array) {
            list.add(word);
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.equals(b)) return 0;
                int min = Math.min(a.length(), b.length());
                for (int i = 0; i < min; i++) {
                    if (a.charAt(i) != b.charAt(i)) {
                        return a.charAt(i) - b.charAt(i);
                    }
                }
                return a.length() - b.length();
            }
        });
        return list;
    }

    public static void main(String[] args) {
        String[] str = new String[]{"яблоко", "груша", "мандарин", "ястреб"};
        System.out.println(compareString(str));
    }
}