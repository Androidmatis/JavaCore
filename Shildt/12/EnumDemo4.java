// Демонстрация использования методов ordinal(), compareTo() и equals().
// Перечисления сортов яблок.
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        // Получить все порядковые номера с применение ordinal().
        System.out.println("Все константы перечисления Apple" +
                " вместе с их порядковыми номерами: ");
        for (Apple a: Apple.values())
            System.out.println(a + " " + a.ordinal());
        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;
        System.out.println();
        // Демонстарация использования CompareTo() и equals().
        if (ap.compareTo(ap2) < 0)
            System.out.println(ap + " находится перед " + ap2);
        if (ap.compareTo(ap2) > 0)
            System.out.println(ap2 + " находится перед " + ap);
        if (ap.compareTo(ap3) == 0)
            System.out.println(ap + " равно " + ap3);
        System.out.println();
        if (ap.equals(ap2))
            System.out.println("Ошибка!");
        if (ap.equals(ap3))
            System.out.println(ap + " равно " + ap3);
        if (ap == ap3)
            System.out.println(ap + " == " + ap3);
    }
}
