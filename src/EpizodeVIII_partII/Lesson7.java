package EpizodeVIII_partII;

import java.util.HashMap;
import java.util.Map;

public class Lesson7 {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.1, "one");
        labels.put(1.2, "two");
        labels.put(1.3, "three");
        labels.put(1.4, "four");
        labels.put(1.5, "five");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
