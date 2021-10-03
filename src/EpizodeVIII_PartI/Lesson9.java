package EpizodeVIII_PartI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lesson9 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b;
        if ((a = Integer.parseInt(reader.readLine())) <= 0 || (b = Integer.parseInt(reader.readLine())) <= 0)
            throw new Exception();
        System.out.println(nod(a, b));
        reader.close();
    }


    public static int nod(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return nod(b, a % b);
    }
}
