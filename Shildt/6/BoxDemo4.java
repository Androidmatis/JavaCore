// Теперь volume() возвращает объем коробки.
class Box {
    double width;
    double height;
    double derth;
    // Вычислить и возвратить объем
    double volume() {
        return width * height * derth;
    }
}
class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        // Присвоить знаечния переменным экземпляра mybox1.
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.derth = 15;
        // Присвоить переменным экземпляра mybox2 другие значения.
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.derth = 9;
        // Вычислить объем первой коробки
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);
        // Вычислить объем второй коробки
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
