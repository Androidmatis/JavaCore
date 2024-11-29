import java.util.Calendar;
import java.util.Formatter;

// Использование относительных индексов для упрощения
// создания специального формата времени и даты.
class FormatDemo6 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        fmt.format("Сегодня день %te месяца %<tB, %<tY", cal);
        System.out.println(fmt);
        fmt.close();
    }
}
