package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(25, "Света"));
        people.add(new Person(30, "Витя"));
        people.add(new Person(25, "Петя"));
        people.add(new Person(30, "Ваня"));
        people.add(new Person(20, "Лена"));

        System.out.println("Список людей до сортировки:");
        for (Person person : people) {
            System.out.println(person.getName() + ", " + person.getAge());
        }

        // Сортируем список по возрасту и имени
        Collections.sort(people, new PersonSuperComparator());

        System.out.println("\nСписок людей после сортировки:");
        for (Person person : people) {
            System.out.println(person.getName() + ", " + person.getAge());
        }
    }
}
