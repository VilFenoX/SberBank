package EpizodeIII_PartI;

import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        if (count > 0 && count%2 == 0){
            System.out.println("compassion");
        }
        else if (count > 0 && count%2 != 0 ){
            System.out.println("mercy");
        }
        else if (count < 0 && count%2 == 0){
            System.out.println("pain");
        }
        else if (count < 0 && count%2 != 0 ){
            System.out.println("anger");
        }
        else System.out.println("balance");
    }
}
