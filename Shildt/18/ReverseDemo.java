// Использование reverse() для изменения на противоположный
// порядка следования символов в StringBuffer.
class ReverseDemo {
    public static void main(String[] args) {
        StringBuffer s= new StringBuffer("abcdef");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}
