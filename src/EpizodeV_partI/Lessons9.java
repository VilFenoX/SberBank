package EpizodeV_partI;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lessons9 {
     public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++)
            set.add(i);
        return set;
    }

    public static Set<Integer> removeGreaterThan10(Set<Integer> set) {
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext())
        {
            if (iter.next() > 10)
                iter.remove();
        }
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> set = createSet();
        System.out.println(removeGreaterThan10(set));
    }
}
