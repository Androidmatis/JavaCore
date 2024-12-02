import java.util.Scanner;

// Демонстрация использования findInLine().
class FindInLineDemo {
    public static void main(String[] args) {
        String instr = "Name: Tom Age: 28 ID: 77";
        Scanner conin = new Scanner(instr);
        // Найти и отобразить возраст.
        conin.findInLine("Age:");   // найти Age
        if (conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Ошибка!");
        conin.close();
    }
}
