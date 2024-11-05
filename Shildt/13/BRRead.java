// Использование объекта BufferedReader для чтения символов в консоли.
import java.io.*;

class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));
        System.out.println("Вводите символы; для выхода введите q.");
        // Читать символы.
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
