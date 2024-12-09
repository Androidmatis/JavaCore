// Демонстрация использования класса URLConnection.
import java.net.*;
import java.io.*;
import java.util.Date;
class UCDemo {
    public static void main(String[] args) throws Exception {
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();
        // Получить дату.
        long d = hpCon.getDate();
        if (d == 0)
            System.out.println("Информация о дате недоступна.");
        else
            System.out.println("Дата: " + new Date(d));
        // Получить тип содержимого.
        System.out.println("Content-Type: " + hpCon.getContentType());
        // Получить дату срока действия.
        d = hpCon.getExpiration();
        if (d == 0)
            System.out.println("Информация о сроке действия недоступна.");
        else
            System.out.println("Срок действия: " + new Date(d));
        // Получить дату последней модификации.
        d = hpCon.getLastModified();
        if (d == 0)
            System.out.println("Информация о последней модификации недоступна.");
        else
            System.out.println("Last-Modified: " + new Date(d));
        // Получить длину содержимого.
        long len = hpCon.getContentLengthLong();
        if (len == -1)
            System.out.println("Длина содержимого недоступна.");
        else
            System.out.println("Content-Length: " + len);
        if (len != 0) {
            System.out.println("=== Содержимое ===");
            InputStream input = hpCon.getInputStream();
            while (((c = input.read()) != -1)) {
                System.out.print((char) c);
            }
            input.close();
        } else {
            System.out.println("Содержимое недоступно.");
        }
    }
}
