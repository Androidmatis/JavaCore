// Демонстрация использования replace().
class ReplaceDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Строка для тестирования.");
        sb.replace(7, 10, "для целей");
        System.out.println("После replace(): " + sb);
    }
}
