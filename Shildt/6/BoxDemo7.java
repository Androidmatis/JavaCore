/*  Здесь в Box используется конструктор
    для инициализации размеров коробок.
 */
class Box {
    double width;
    double height;
    double derth;
    // Это конструктор для Box.
    Box(double w, double h, double d) {
        System.out.println("Конструирование Box");
        width = w;
        height = h;
        derth = d;
    }
    // Вычислить и возвратить объем
    double volume() {
        return width * height * derth;
    }
}
class BoxDemo7 {
    public static void main(String[] args) {
        // Объявить, разместить в памяти и инициализировать объекты Box.
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);
        double vol;
        // Получить объем первой коробки
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);
        // Получить объем второй коробки
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
