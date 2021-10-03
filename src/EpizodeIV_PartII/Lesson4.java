package EpizodeIV_PartII;

import java.util.ArrayList;

public class Lesson4 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
            array.add("ArrayList");
        System.out.println(array.size());
        for (int i = 0; i < 5; i++)
            System.out.println(array.get(i));
    }
}
