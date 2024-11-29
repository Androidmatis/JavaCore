import java.util.Formatter;

// Демонстрация выравнивания по левому краю.
class LeftJustify {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        // По умолчанию выполняется выравнивание по правому краю.
        fmt.format("|%10.2f|", 123.123);
        System.out.println(fmt);
        fmt.close();
        // Теперь выровнять по левому краю.
        fmt = new Formatter();
        fmt.format("|%-10.2f|", 123.123);
        System.out.println(fmt);
        fmt.close();
    }
}
