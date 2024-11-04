// Демонстрация работы автоупаковки/автораспаковки.
class AutoBox {
    public static void main(String[] args) {
        Integer iOb = 100;  // автоупаковка значения int
        int i = iOb;        // автораспаковка
        System.out.println(i + " " + iOb);  // выводит 100 100
    }
}
