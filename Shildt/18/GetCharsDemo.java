class GetCharsDemo {
    public static void main(String[] args) {
        String s = "Строка для демонстрации работы метода getChars().";
        int start = 11;
        int end = 15;
        char[] buf = new char[end - start];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);
    }
}
