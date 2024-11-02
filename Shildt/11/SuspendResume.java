// Приостановка и возобновление современным спрособом.
class NewThread implements Runnable {
    String name;    // имя потока
    Thread t;
    boolean suspendFlag;
    NewThread(String threadname) {
        name = threadname;
        t = new Thread("Новый поток: " + t);
        suspendFlag = false;
    }
    // Это точка входа для потока.
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершается.");
    }
    synchronized void mysuspend() {
        suspendFlag = true;
    }
    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}
class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        ob1.t.start();  // запустить поток
        ob2.t.start();  // запустить поток
        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Приостановка потока One");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Возобновление потока One");
            ob2.mysuspend();
            System.out.println("Приостановка потока Two");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Возобновление потока Two");
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        // Ожидать завершения потоков.
        try {
            System.out.println("Ожидание завершения потоков.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершается.");
    }
}
