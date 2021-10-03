package EpizodeIV_PartII;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        String string[] = new String[10];
        int integer[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<10; i++){
            string[i] = scanner.nextLine();
        }
        for(int i = 0; i<10; i++){
            integer[i] = string[i].length();
        }
    }
}
