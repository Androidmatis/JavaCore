// Демонстрация работы сцепленых исключений.
class ChainExcDemo {
    static void demoproc() {
        // Создать исключение.
        NullPointerException e = new NullPointerException("Верхний уровень");
        // Добавить причину.
        e.initCause(new ArithmeticException("причина"));
        throw e;
    }
    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            // Отобразить исключение верхнего уровня.
            System.out.println("Перехвачено: " + e);
            // Отобразить исключение-причину.
            System.out.println("Первоначальная причина: " + e.getCause());
        }
    }
}
