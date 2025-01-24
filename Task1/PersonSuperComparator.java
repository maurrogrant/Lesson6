package Task1;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        // Сравнение по возрасту
        if (p1.getAge() != p2.getAge()) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
        // Если возраст одинаковый, сравниваем по имени
        return p1.getName().compareTo(p2.getName());
    }
}
