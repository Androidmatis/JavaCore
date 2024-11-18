import java.util.*;

// Использовать thenComparing() для сортировки счетов по фамилии
// и затем по имени владельца.
// Компаратор, который сравнивает по фамилии.
class CompLastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        // Найти индекс, начинающийся с фамилии.
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
// Сортировать по полному имени, когда фамилии одинаковые.
class CompThenByFirstName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        return aStr.compareToIgnoreCase(bStr);
    }
}
class TreeMapDemo2A {
    public static void main(String[] args) {
        // Использовать thenComparing() для создания компаратора, который
        // сравнивает фамилии и затем полные имена, когда фамилии совпадают.
        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst =
                compLN.thenComparing(new CompThenByFirstName());
        // Создать древовидную карту.
        TreeMap<String, Double> hm = new TreeMap<>(compLastThenFirst);
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
