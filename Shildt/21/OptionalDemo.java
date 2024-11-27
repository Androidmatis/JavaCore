import java.util.Optional;

// Демонстрация работы нескольких методов Optional<T>.
class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("ABCDEFG");
        if (noVal.isPresent()) System.out.println("Это не отобразится");
        else System.out.println("noVal не имеет значения");
        if (hasVal.isPresent()) System.out.println("Строка в hasVal: " +
                hasVal.get());
        String deStr = noVal.orElse("Стандартная строка");
        System.out.println(deStr);
    }
}
