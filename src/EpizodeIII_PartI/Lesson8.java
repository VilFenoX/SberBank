package EpizodeIII_PartI;

import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
