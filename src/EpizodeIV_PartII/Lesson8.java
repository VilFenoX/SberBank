package EpizodeIV_PartII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Lesson8 {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<String>();

        for (int i = 0; i < 10; i++)
            arr.add(buff.readLine());
        int length = arr.get(0).length();
        for (int i = 0; i < arr.size() - 1; i++){
            if (arr.get(i + 1).length() < arr.get(i).length()){
                System.out.println(i + 2);
                break;
            }
        }
    }
}
