package EpizodeV_partI;

import java.util.HashMap;
import java.util.Map;

public class Lesson3 {

        public static void main(String[] args) throws Exception {
            String[] heroes = new String[]{"leia", "luke", "obi-wan", "solo", "anakin", "sidius", "yoda", "chewbacca", "windu", "vader"};
            Map<String, Hero> map = addHeroesToMap(heroes);
            for (Map.Entry<String, Hero> pair : map.entrySet()) {
                System.out.println(pair.getKey() + " - " + pair.getValue());
            }
        }
        public static Map<String, Hero> addHeroesToMap(String[] heroes) {
            Map<String, Hero> hero = new HashMap<>();
            for (int i =0; i<10; i++){
                hero.put(heroes[i],new Hero(heroes[i]));
            }
            return  hero;//напишите тут ваш код
        }
        public static class Hero {
            String name;
            public Hero(String name) {
                this.name = name;
            }
            @Override
            public String toString() {
                return name != null ? name.toUpperCase() : null;
            }
        }
    }

