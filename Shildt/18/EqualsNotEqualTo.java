// equals() или ==
class EqualsNotEqualTo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String(s1);
        System.out.println("Сравнение строк " + s1 + " и " + s2 +
                " с помощью equals() -> " + s1.equals(s2));
        System.out.println("Сравнение строк " + s1 + " и " + s2 +
                " с помощью == -> " + (s1 == s2));
    }
}
