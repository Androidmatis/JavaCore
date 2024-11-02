// Использование join() для ожидания окончания потоков.
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

class DemoJoin {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("One");
        NewThread nt2 = new NewThread("Two");
        NewThread nt3 = new NewThread("Three");
        // Запустить потоки
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();
        System.out.println("Поток One работает: " + nt1.t.isAlive());
        System.out.println("Поток Two работает: " + nt2.t.isAlive());
        System.out.println("Поток Three работает: " + nt3.t.isAlive());
        // Ожидать завершение потоков.
        try {
            System.out.println("Ожидание завершения потоков.");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Поток One работает: " + nt1.t.isAlive());
        System.out.println("Поток Two работает: " + nt2.t.isAlive());
        System.out.println("Поток Three работает: " + nt3.t.isAlive());
        System.out.println("Завершение главного потока.");
    }
}
