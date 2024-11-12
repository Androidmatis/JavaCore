// Демонстрация использования toUpperCase() и toLowerCase().
class ChangeCase {
    public static void main(String[] args) {
        String s = "This is a test.";
        System.out.println("Первоначальная строка: " + s);
        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        System.out.println("Строка в верхнем регистре: " + upper);
        System.out.println("Строка в нижнем регистре: " + lower);
    }
}
