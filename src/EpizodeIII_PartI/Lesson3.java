package EpizodeIII_PartI;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        if (count<0){
            System.out.println("it’s Dark side");
        }
        else if(count>0){
            System.out.println("it’s Light side");
        }
        else System.out.println("it’s balance");
    }
}
