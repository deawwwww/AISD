public class Task1 {
    public static boolean isShifted(String s, String t) {
        return (s.length() == t.length()) && (s + s).contains(t);
    }
}