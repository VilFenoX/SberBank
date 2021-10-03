package EpizodeV_partI;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Lesson6 {
    public static void main(String[] args) {


    System.out.println(getInsertTime(new ArrayList()));
        System.out.println(getInsertTime(new LinkedList()));
}
    public static long getInsertTime(List list) {
        Date date1 = new Date();// напишите тут ваш код
        // напишите тут ваш код
        insert10000(list);
        Date date2 = new Date();
        return (date2.getTime()-date1.getTime());// напишите тут ваш код
    }
    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
