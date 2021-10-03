package EpizodeV_partI;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lessons10 {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++)
            map.put(Integer.toString(i), Integer.toString(i));
        return map;
    }

    public static int getCountFirstName(Map<String, String> map, String name) {
        int count = 0;
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            if (iter.next().getValue().equals(name))
                count++;
        }
        return count;
    }

    public static int getCountLastName(Map<String, String> map, String lastName) {
        int count = 0;
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            if (iter.next().getKey().equals(lastName))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(getCountFirstName(map, "1"));
        System.out.println(getCountLastName(map, "2"));
    }
}
