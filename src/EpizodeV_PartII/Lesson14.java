package EpizodeV_PartII;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Lesson14 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            try {
                int a = Integer.parseInt(reader.readLine());
                list.add(a);
            }
            catch (Exception e) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
                break;
            }
        }
    }
}
