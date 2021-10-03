package EpizodeV_partI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Starwars {
    public static void main(String[] args) throws IOException {
        List<Integer> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        int max = 1;
        for (int i = 0; i < 10; i++)
            array.add(Integer.parseInt(reader.readLine()));
        for (int i = 0; i + 1 < 10; i++){
            if (array.get(i).equals(array.get(i + 1)))
                count++;
            else
                count = 1;
            if (count > max)
                max = count;
        }
        System.out.println(max);
    }
}
