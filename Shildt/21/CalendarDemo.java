import java.util.Calendar;

// Демонстрация работы нескольких методов класса Calendar.
class CalendarDemo {
    public static void main(String[] args) {
        String[] months = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"
        };
        // Создать календарь, инициализированный текущей датой и временем
        // в стандартной локали и часовом поясе.
        Calendar calendar = Calendar.getInstance();
        // Отобразить текущую информацию о времени и дате.
        System.out.print("Дата: ");
        System.out.print(months[calendar.get(Calendar.MONTH)]);
        System.out.print(" " + calendar.get(Calendar.DATE) + " ");
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.print("Время: ");
        System.out.print(calendar.get(Calendar.HOUR) + ":");
        System.out.print(calendar.get(Calendar.MINUTE) + ":");
        System.out.println(calendar.get(Calendar.SECOND));
        // Установить информацию о времени и дате и отобразить ее.
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 29);
        calendar.set(Calendar.SECOND, 22);
        System.out.print("Обновленное время: ");
        System.out.print(calendar.get(Calendar.HOUR) + ":");
        System.out.print(calendar.get(Calendar.MINUTE) + ":");
        System.out.println(calendar.get(Calendar.SECOND));
    }
}
