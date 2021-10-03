package EpizodeIV_PartI;

import java.util.Scanner;

public class ConsoleReader {

    public static String readString() throws Exception {
       Scanner scannerString = new Scanner(System.in);
       return scannerString.nextLine();//напишите тут ваш код
    }

    public static int readInt() throws Exception {
       Scanner scannerInt = new Scanner(System.in);
       return scannerInt.nextInt();//напишите тут ваш код
    }

    public static double readDouble() throws Exception {
       Scanner scannerDouble = new Scanner(System.in);
       return scannerDouble.nextDouble();//напишите тут ваш код
    }

    public static boolean readBoolean() throws Exception {
       Scanner scannerBoolean = new Scanner(System.in);
       if(scannerBoolean.equals("true")){
       return true;}
       else if(scannerBoolean.equals("false"))
           return false;
        else return true;//напишите тут ваш код
    }

    public static void main(String[] args) throws Exception {
    }
}
