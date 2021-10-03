package EpizodeV_partI;

import java.util.HashSet;
import java.util.Set;

public class Lesson1 {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("dron");
        stringSet.add("galaxy");
        stringSet.add("jedi");
        stringSet.add("wars");
        stringSet.add("star");
        stringSet.add("yoda");
        stringSet.add("master");
        stringSet.add("luke");
        stringSet.add("force");
        stringSet.add("sith");

        for (String line: stringSet
             ) {
            System.out.println(line);
        }
    }
}
