package Task3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        UniqueValueChecker checker = new UniqueValueChecker();

        // Пример 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("Вася", "Иванов");
        map1.put("Петр", "Петров");
        map1.put("Виктор", "Сидоров");
        map1.put("Сергей", "Савельев");
        map1.put("Вадим", "Викторов");

        System.out.println("Пример 1: " + checker.isUnique(map1)); // Ожидается true

        // Пример 2
        Map<String, String> map2 = new HashMap<>();
        map2.put("Вася", "Иванов");
        map2.put("Петр", "Петров");
        map2.put("Виктор", "Иванов");
        map2.put("Сергей", "Савельев");
        map2.put("Вадим", "Петров");

        System.out.println("Пример 2: " + checker.isUnique(map2)); // Ожидается false
    }
}
