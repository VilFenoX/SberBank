package EpizodeII_partI;

public class Lesson9 {
    public static int min(int a, int b) {
        if (a < b){
            return a;}
    else return b;//напишите тут ваш код
    }
    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
