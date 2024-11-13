// Демонстрация работы delete() и deleteCharAt().
class DeleteDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Строка для тестирования.");
        sb.delete(6, 10);
        System.out.println("После delete(): " + sb);
        sb.deleteCharAt(0);
        System.out.println("После deleteCharAt(): " + sb);
    }
}
