/*  Здесь в Box используется конструктор
    для инициализации размеров коробок.
 */
class Box {
    double width;
    double height;
    double derth;
    // Это конструктор для Box.
    Box() {
        System.out.println("Конструирование Box");
        width = 10;
        height = 10;
        derth = 10;
    }
    // Вычислить и возвратить объем
    double volume() {
        return width * height * derth;
    }
}
class BoxDemo6 {
    public static void main(String[] args) {
        // Объявить, разместить в памяти и инициализировать объекты Box.
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        // Получить объем первой коробки
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);
        // Получить объем второй коробки
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
