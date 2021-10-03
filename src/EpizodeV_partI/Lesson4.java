package EpizodeV_partI;

import java.util.HashMap;
import java.util.Map;

public class Lesson4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("leia", "leia");
        map.put("veider", "veider");
        map.put("darth", "darth");
        map.put("anakin", "anakin");
        map.put("skywalker", "skywalker");
        map.put("star", "star");
        map.put("wars", "wars");
        map.put("dron", "dron");
        map.put("yoda", "yoda");
        map.put("master", "master");
        printHeroes(map);
    }
    public static void printHeroes(Map<String, String> map) {
        for (Map.Entry<String,String> pair: map.entrySet()){
            System.out.println(pair.getValue() + " - " + pair.getKey());
        }
              {

        }// Напишите тут ваш код
    }
}
