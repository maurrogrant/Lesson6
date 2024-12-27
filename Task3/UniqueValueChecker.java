import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueValueChecker {

    public boolean isUnique(Map<String, String> map) {
        // Если карта пустая, возвращаем true
        if (map.isEmpty()) {
            return true;
        }

        // Используем HashSet для хранения уникальных значений
        Set<String> uniqueValues = new HashSet<>();

        // Проходим по всем значениям в карте
        for (String value : map.values()) {
            // Если значение уже существует в множестве, значит, оно не уникально
            if (!uniqueValues.add(value)) {
                return false; // Найден дубликат
            }
        }

        // Если все значения уникальны
        return true;
    }
}
