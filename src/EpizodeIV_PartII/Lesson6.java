package EpizodeIV_PartII;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Lesson6 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arr = new ArrayList<String>();
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        for(int j = 0; j < 5; j++)
            arr.add(buff.readLine());
        for(int i = 0; i < 13; i++)
            arr.add(0, arr.remove(arr.size() - 1));
        for(int i = 0; i < arr.size(); i++)
            System.out.println(arr.get(i));
    }
}
