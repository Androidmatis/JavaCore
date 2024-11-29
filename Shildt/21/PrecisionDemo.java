import java.util.Formatter;

// Демонстрация использования спецификатора точности.
class PrecisionDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        // Формировать с 4 десятичными разрядами.
        fmt.format("%.4f", 123.1234567);
        System.out.println(fmt);
        fmt.close();
        // Формировать с 2 десятичными разрядами в 16-символьном поле.
        fmt = new Formatter();
        fmt.format("%16.2e", 123.1234567);
        System.out.println(fmt);
        fmt.close();
        // Формировать не более 15 символов в строке.
        fmt = new Formatter();
        fmt.format("%.15s", "Форматировать с помощью Java теперь легко.");
        System.out.println(fmt);
        fmt.close();
    }
}
