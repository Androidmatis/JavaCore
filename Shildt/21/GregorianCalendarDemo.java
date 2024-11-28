import java.util.Calendar;
import java.util.GregorianCalendar;

// Демонстрация использования класса GregorianCalendar.
class GregorianCalendarDemo {
    public static void main(String[] args) {
        String[] months = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"
        };
        int year;
        // Создать григорианский календарь, инициализированный текущей датой
        // и временем в стандартной локали и часовом поясе.
        GregorianCalendar gcalendar = new GregorianCalendar();
        // Отобразить текущую информацию о времени и дате.
        System.out.print("Дата: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gcalendar.get(Calendar.YEAR));
        System.out.print("Время: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));
        // Проверить, является ли текущий год високосным.
        if (gcalendar.isLeapYear(year)) {
            System.out.println("Текущий год является високосным.");
        } else {
            System.out.println("Текущий год не является високосным.");
        }
    }
}
