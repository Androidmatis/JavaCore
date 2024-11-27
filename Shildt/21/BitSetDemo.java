import java.util.BitSet;

// Демонстрация работы BitSet.
class BitSetDemo {
    public static void main(String[] args) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);
        // Установить ряд битов.
        for (int i = 0; i < 16; i++) {
            if ((i % 2) == 0) bits1.set(i);
            if ((i % 5) != 0) bits2.set(i);
        }
        System.out.println("Начальный набор битов в bits1: ");
        System.out.println(bits1);
        System.out.println("\nНачальный набор битов в bits2: ");
        System.out.println(bits2);
        // Выполнить операцию логического И с битами.
        bits2.and(bits1);
        System.out.println("\nbits2 AND bits1: ");
        System.out.println(bits2);
        // Выполнить операцию логического ИЛИ с битами.
        bits2.or(bits1);
        System.out.println("\nbits2 OR bits1: ");
        System.out.println(bits2);
        // Выполнить операцию логического исключающего ИЛИ с битами.
        bits2.xor(bits1);
        System.out.println("\nbits2 XOR bits1: ");
        System.out.println(bits2);
    }
}
