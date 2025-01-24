package Task4;

import java.util.HashSet;
import java.util.Set;

public class EvenLengthRemover {

    public Set<String> removeEvenLength(Set<String> set) {
        Set<String> resultSet = new HashSet<>();

        for (String str : set) {
            if (str.length() % 2 != 0) { // Проверка на нечетную длину
                resultSet.add(str);
            }
        }

        return resultSet;
    }
}
