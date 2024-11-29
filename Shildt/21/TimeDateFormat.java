import java.util.Calendar;
import java.util.Formatter;

// Форматирование времени и даты.
class TimeDateFormat {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        // Отобразить время в стандартном 12-часовом формате.
        fmt.format("%tr", cal);
        System.out.println(fmt);
        fmt.close();
        // Отобразить полную информацию о дате и времени.
        fmt = new Formatter();
        fmt.format("%tc", cal);
        System.out.println(fmt);
        fmt.close();
        // Отобразить только часы и минуты.
        fmt = new Formatter();
        fmt.format("%tl:%tM", cal, cal);
        System.out.println(fmt);
        fmt.close();
        // Отобразить месяц по названию и номеру.
        fmt = new Formatter();
        fmt.format("%tB %tb %tm", cal, cal, cal);
        System.out.println(fmt);
        fmt.close();
    }
}
