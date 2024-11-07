// Простой обобщенный класс с двумя параметрами типов: T и V.
class TwoGen<T, V> {
    T ob1;
    V ob2;
    // Передать конструктору ссылки на объекты типов T и V.
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    // Вывести типы T и V.
    void showTypes() {
        System.out.println("Типом T является " + ob1.getClass().getName());
        System.out.println("Типом V является " + ob2.getClass().getName());
    }
    T getOb1() {
        return ob1;
    }
    V getOb2() {
        return ob2;
    }
}
// Демонстрация использования TwoGen.
class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Обобщения");
        // Вывести типы.
        tgObj.showTypes();
        // Получить и вывести значения.
        int v = tgObj.getOb1();
        System.out.println("Значение: " + v);
        String str = tgObj.getOb2();
        System.out.println("Значение: " + str);
    }
}
