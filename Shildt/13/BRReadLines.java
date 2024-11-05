// Чтение строки с консоли с применением BufferedReader.
import java.io.*;

class BRReadLines {
    public static void main(String[] args) throws IOException {
        // Создать объект BufferedReader, используя System.in.
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));
        String str;
        System.out.println("Вводите строки текста.");
        System.out.println("Для завершения введите stop.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
