package EpizodeIV_PartII;

import java.util.ArrayList;

public class Lrsson7 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("darth");
        strings.add("veider");
        strings.add("skywalker");
        strings.add("jedi");
        strings = ArrayList(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> ArrayList(ArrayList<String> strings) {
        for (int i = 0; i < strings.size() - 1; i++){
            if (!strings.get(i).contains("d") && strings.get(i).contains("s"))
                strings.add(strings.get(i));
            else if (strings.get(i).contains("d") && !strings.get(i).contains("j"))
                strings.remove(i--);
        }
        return strings;
    }
}
