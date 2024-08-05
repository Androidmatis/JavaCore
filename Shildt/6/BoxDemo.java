/*  Программа, в которой используется класс Box.
    Назовите этот файл BoxDemo.java
 */
class Box {
    double width;
    double height;
    double derth;
}
// В этом классе объявляется объект типа Box.
class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        // Присвоить знаечния переменным экземпляра mybox.
        mybox.width = 10;
        mybox.height = 20;
        mybox.derth = 15;
        // Вычислить объем коробки.
        vol = mybox.width * mybox.height * mybox.derth;
        System.out.println("Объем равен " + vol);
    }
}
