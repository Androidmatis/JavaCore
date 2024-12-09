// Демонстрация использования класса Socket.
import java.net.*;
import java.io.*;
class Whois {
    public static void main(String[] args) throws Exception {
        int c;
        // Создать сокет, подключенный к internic.net, порт 43.
        try (Socket s = new Socket("whois.internic.net", 43)) {
            // Получить потоки ввода и вывода.
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();
            // Сконструировать строку запроса.
            String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";
            // Преобразовать в байты.
            byte[] buf = str.getBytes();
            // Отправить запрос.
            out.write(buf);
            // Прочитать и отобразить ответ.
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        }
    }
}
