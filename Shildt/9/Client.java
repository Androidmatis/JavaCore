import java.lang.Override;

class Client implements Callback {
    // Реализовать метод интерфейса CallBack.
    public void callback(int p) {
        System.out.println("callback() вызывается со значением " + p);
    }

    void nonInterface() {
        System.out.println("Классы, которые реализуют интерфейсы, " +
                "могут также определять и другие члены.");
    }
}
