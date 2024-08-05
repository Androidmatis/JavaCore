// В этой программе используется параметризированный метод.
class Box {
    double width;
    double height;
    double derth;
    // Вычислить и возвратить объем
    double volume() {
        return width * height * derth;
    }
    // Установить размеры коробки.
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        derth = d;
    }
}
class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        // Инициализировать объекты коробок
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);
        // Вычислить объем первой коробки
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);
        // Вычислить объем второй коробки
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
