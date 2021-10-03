package EpizodeIV_PartII;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Lesson5 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arr = new ArrayList<String>();
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int flag = 0;
        int min = 0;
        for(int i = 0; i < 5; i++){
            arr.add(buff.readLine());
            if (flag == 0){
                min = arr.get(i).length();
                flag = 1;
            }
            if (arr.get(i).length() < min)
                min = arr.get(i).length();
        }
        for (int i = 0; i < 5; i++){
            if (arr.get(i).length() == min)
                System.out.println(arr.get(i));
        }
    }
}
