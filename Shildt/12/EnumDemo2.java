// Использование встроеных методов перечисления.
// Перечисления сортов яблок.
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Все константы перечисления Apple:");
        // Использовать values().
        Apple[] allapples = Apple.values();
        for (Apple a: allapples)
            System.out.println(a);
        System.out.println();
        // Использовать valueOf().
        ap = Apple.valueOf("Winesap");
        System.out.println("ap содержит " + ap);
    }
}
