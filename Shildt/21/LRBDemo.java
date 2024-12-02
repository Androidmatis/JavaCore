import java.util.*;

class LRBDemo {
    public static void main(String[] args) {
        // Загрузить стандартный комплект.
        ResourceBundle rd = ResourceBundle.getBundle("SampleRB");
        System.out.println("Английская версия: ");
        System.out.println("Строка для ключа title: " +
                rd.getString("title"));
        System.out.println("Строка для ключа StopText: " +
                rd.getString("StopText"));
        System.out.println("Строка для ключа StartText: " +
                rd.getString("StartText"));
        // Загрузить комплект для немецкой версии.
        rd = ResourceBundle.getBundle("SampleRB", Locale.GERMAN);
        System.out.println("\nНемецкая версия: ");
        System.out.println("Строка для ключа title: " +
                rd.getString("title"));
        System.out.println("Строка для ключа StopText: " +
                rd.getString("StopText"));
        System.out.println("Строка для ключа StartText: " +
                rd.getString("StartText"));
    }
}
