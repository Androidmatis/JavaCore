// Использовать trim() для обработки команд.
import java.io.*;

class UseTrim {
    public static void main(String[] args) throws IOException {
        // Создать экземпляр BufferedReader, используя System.in.
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));
        String str;
        System.out.println("Для завершения введите 'стоп'.");
        System.out.println("Введите название штата: ");
        do {
            str = br.readLine();
            str = str.trim();   // удалить пробельные символы
            if (str.equals("Иллинойс"))
                System.out.println("Столица - Спрингфилд.");
            else if (str.equals("Миссури"))
                System.out.println("Столица - Джефферсон-Сити.");
            else if (str.equals("Калифорния"))
                System.out.println("Столица - Сакраменто.");
            else if (str.equals("Вашингтон"))
                System.out.println("Столица - Олимпия.");
        } while (!str.equals("стоп"));
    }
}
