package EpizodeV_partI;

import java.util.HashMap;
import java.util.Map;

public class Lesson2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("leia","organa");
        map.put("luke","skywalker");
        map.put("general ","hux");
        map.put("captain","phasma");
        map.put("darth","veider");
        map.put("obi-wan","kenobi");
        map.put("anakin","skywalker");
        map.put("jar-jar","binks");
        map.put("count","dooku");
        map.put("master","yoda");

        for(Map.Entry<String, String> pair : map.entrySet()){
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
