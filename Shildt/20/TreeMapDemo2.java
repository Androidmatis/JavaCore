import java.util.*;
// Использовать компаратор для сортировки счетов по фамилии владельца.
class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;
        // Найти индекс, начинающийся с фамилии.
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
        if (k == 0) // фамилии совпадают, проверить полное имя
            return aStr.compareTo(bStr);
        else
            return k;
    }
    // Переопределять equals() не нужно.
}
class TreeMapDemo2 {
    public static void main(String[] args) {
        // Создать древовидную карту.
        TreeMap<String, Double> hm = new TreeMap<>(new TComp());
        // Поместить элементы в карту.
        hm.put("John Doe", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Jane Baker", 1378.00);
        hm.put("Tod Hall", 99.22);
        hm.put("Ralph Smith", -19.08);
        // Получить набор элементов.
        Set<Map.Entry<String, Double>> set = hm.entrySet();
        // Отобразить содержимое набора.
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        // Пополнить счет клиента John Doe на 1000.
        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);
        System.out.println("Новый баланс клиента John Doe: " + hm.get("John Doe"));
    }
}
