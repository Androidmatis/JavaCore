// В этой программе внутрь класса Box добавляется метод.
class Box {
    double width;
    double height;
    double derth;
    // Отобразить объем коробки
    void volume() {
        System.out.print("Объем равен ");
        System.out.println(width * height * derth);
    }
}
class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        // Присвоить знаечния переменным экземпляра mybox1.
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.derth = 15;
        // Присвоить переменным экземпляра mybox2 другие значения.
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.derth = 9;
        // Вычислить объем первой коробки
        mybox1.volume();
        // Вычислить объем второй коробки
        mybox2.volume();
    }
}
