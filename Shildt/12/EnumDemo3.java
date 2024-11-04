// Использование конструктора перечисления, переменной экземпляра и метода.
enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private  int price; // цена яблок каждого сорта
    // Конструктор.
    Apple(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}
class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;
        // Оторбразить цену яблок сорта Winesap.
        System.out.println("Яблоки сорта Winesap стоят " +
                Apple.Winesap.getPrice() +
                " центов.\n");
        // Отобразить все сорта яблок вместе с ценами.
        System.out.println("Цены на все сорта яблок:");
        for (Apple a : Apple.values())
            System.out.println("Яблоки сорта " + a + " стоят " +
                    a.getPrice() + " центов.");
    }
}
