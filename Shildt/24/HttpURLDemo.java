// Демонстрация использования класса HttpURLConnection.
import java.net.*;
import java.io.*;
import java.util.*;
class HttpURLDemo {
    public static void main(String[] args) throws Exception {
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
        // Отобразить метод запроса.
        System.out.println("Метод запроса: " + hpCon.getRequestMethod());
        // Отобразить код ответа.
        System.out.println("Код ответа: " + hpCon.getResponseCode());
        // Отобразить сообщение ответа.
        System.out.println("Сообщение ответа: " + hpCon.getResponseMessage());
        // Получить список полей заголовка и набор ключей заголовка.
        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nЗаголовок:");
        // Отобразить все ключи заголовка.
        for (String k : hdrField) {
            System.out.println(" Ключ: " + k +
                    " Значение: " + hdrMap.get(k));
        }
    }
}
