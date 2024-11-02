// Создание множества потоков.
class NewThread implements Runnable {
    String name;    // имя потока
    Thread t;
    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
    }
    // Это точка входа для потока
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }
}

class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("One");
        NewThread nt2 = new NewThread("Two");
        NewThread nt3 = new NewThread("Three");
        // Запустить потоки
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();
        try {
            // Ожидать окончания остальных потоков.
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Завершение главного потока.");
    }
}
