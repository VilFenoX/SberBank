package EpizodeIII_PartI;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        if((name1.equals("Anakin") && name2.equals("Obi-Wan")) || (name2.equals("Anakin") && name1.equals("Obi-Wan"))){
            System.out.println(name1 + " and " + name2 + " - friends");
        }
        else if(name1.equals("Anakin") || name1.equals("Obi-Wan")){
            System.out.println(name1 + " - friends, " + name2 + " - foe");
        }
        else if(name2.equals("Anakin") || name2.equals("Obi-Wan")){
            System.out.println(name2 + " - friends, " + name1 + " - foe");
        }
        else
            System.out.println(name1 + " and " + name2 + " - foes");
    }

}
