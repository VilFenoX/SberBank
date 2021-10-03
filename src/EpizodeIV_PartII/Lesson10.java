package EpizodeIV_PartII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Lesson10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            arr.add(Integer.parseInt(reader.readLine()));
        for (int i = 9; i != -1; i--)
            System.out.println(arr.get(i));
    }
}
