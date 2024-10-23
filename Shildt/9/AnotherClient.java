class AnotherClient implements Callback {
    // Реализовать метод интерфейса CallBack.
    public void callback(int p) {
        System.out.println("Еще одна версия callback()");
        System.out.println("p в квадрате равно " + (p * p));
    }
}
