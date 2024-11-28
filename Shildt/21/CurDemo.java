import java.util.Currency;
import java.util.Locale;

// Демонстрация использования класса Currency.
class CurDemo {
    public static void main(String[] args) {
        Currency c;
        c = Currency.getInstance(Locale.US);
        System.out.println("Символ: " + c.getSymbol());
        System.out.println("Стандартное количество цифр после десятичной " +
                "точки: " + c.getDefaultFractionDigits());
    }
}
