public class Task3 {
    public static void main(String[] args) {
        String str = "I love Itis";
        String res = "";
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                word += c;
            } else {
                res = word + " " + res;
                word = "";
            }
        }
        res = word + " " + res;
        System.out.println(res);
    }
}