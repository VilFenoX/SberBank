package EpizodeVII_PartII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inStream = new FileInputStream(reader.readLine());
        reader.close();
        while (inStream.available() > 0) {
            System.out.print((char)inStream.read());
        }
        inStream.close();
    }
}
