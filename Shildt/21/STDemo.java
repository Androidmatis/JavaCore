import java.util.StringTokenizer;

// Демонстрация работы StringTokenizer.
class STDemo {
    static String in = "title=Java: The Complete Reference;" +
            "author=Shildt;" +
            "publisher=McGraw Hill;" +
            "copyright=2022";
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(in, "=;");
        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
    }
}
