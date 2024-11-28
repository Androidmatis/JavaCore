import java.util.Formatter;

// Очень простой пример использования Formatter.
class FormatDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        fmt.format("Форматировать %s легко: %d %f", "с помощью Java", 10, 98.6);
        System.out.println(fmt);
        fmt.close();
    }
}
