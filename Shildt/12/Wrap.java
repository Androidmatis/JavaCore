// Демонстрация использования оболочки числового типа.
class Wrap {
    public static void main(String[] args) {
        Integer iOb = Integer.valueOf(100);
        int i = iOb.intValue();
        System.out.println(i + " " + iOb);  // выводит 100 100
    }
}
