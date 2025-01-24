package Task4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        EvenLengthRemover remover = new EvenLengthRemover();

        Set<String> originalSet = new HashSet<>();
        originalSet.add("foo");
        originalSet.add("buzz");
        originalSet.add("bar");
        originalSet.add("fork");
        originalSet.add("bort");
        originalSet.add("spoon");
        originalSet.add("!");
        originalSet.add("dude");

        System.out.println("Исходное множество: " + originalSet);

        Set<String> filteredSet = remover.removeEvenLength(originalSet);

        System.out.println("Множество после удаления четной длины: " + filteredSet);
    }
}
