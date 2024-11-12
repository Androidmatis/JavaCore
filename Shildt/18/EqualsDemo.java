// Демонстрация работы equals() и equalsIgnoreCase();
class EqualsDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Good-bue";
        String s4 = "HELLO";
        System.out.println("Сравнение строк " + s1 + " и " + s2 +
                " с помощью equals() -> " + s1.equals(s2));
        System.out.println("Сравнение строк " + s1 + " и " + s3 +
                " с помощью equals() -> " + s1.equals(s3));
        System.out.println("Сравнение строк " + s1 + " и " + s4 +
                " с помощью equals() -> " + s1.equals(s4));
        System.out.println("Сравнение строк " + s1 + " и " + s4 +
                " с помощью equalsIgnoreCase() -> " +
                s1.equalsIgnoreCase(s4));
    }
}
