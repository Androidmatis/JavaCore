// Демонстрация использования insert().
class InsertDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Мне Java!");
        sb.insert(4, "нравится ");
        System.out.println(sb);
    }
}
