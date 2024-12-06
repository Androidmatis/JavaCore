// Пример использования CyclicBarrier.
import java.util.concurrent.*;
class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());
        System.out.println("Начало");
        new Thread(new MyThread(cb, "A")).start();
        new Thread(new MyThread(cb, "B")).start();
        new Thread(new MyThread(cb, "C")).start();
        new Thread(new MyThread(cb, "X")).start();
        new Thread(new MyThread(cb, "Y")).start();
        new Thread(new MyThread(cb, "Z")).start();
    }
}
class MyThread implements Runnable {
    CyclicBarrier cbar;
    String name;
    MyThread(CyclicBarrier c, String s) {
        cbar = c;
        name = s;
    }
    public void run() {
        System.out.println(name);
        try {
            cbar.await();
        } catch (BrokenBarrierException e) {
            System.out.println(e);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
// Объект этого класса вызывается, когда заканчивается CyclicBarrier.
class BarAction implements Runnable {
    public void run() {
        System.out.println("Барьер достигнут!");
    }
}