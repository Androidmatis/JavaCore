import java.util.Date;

// Отображение даты и времени с использованием только методов класса Date.
class DateDemo {
    public static void main(String[] args) {
        // Создать объект Date.
        Date date = new Date();
        // Отобразить время и дату с применением toString().
        System.out.println(date);
        // Отобразить количество миллисекунд, прошедших с 1 января 1970 года,
        // как среднее время по Гринвичу.
        long msec = date.getTime();
        System.out.println("Количество миллисекунд, прошедших с 1 января 1970 года, " +
                "GMT = " + msec);
    }
}
