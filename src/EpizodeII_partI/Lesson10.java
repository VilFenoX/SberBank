package EpizodeII_partI;

public class Lesson10 {
    public static int max(int a, int b, int c, int d) {
        if (max(a, b) > max(c , d)){
            return max(a,b);
        }
        else return max(c, d);//напишите тут ваш код
    }
    public static int max(int a, int b) {
       if (a > b)
       {  return a;}
       else return b;//напишите тут ваш код
    }
    public static void main(String[] args) throws Exception {
        System.out.println(max(-20, -10));
        System.out.println(max(-40, -10, -30, 40));
        System.out.println(max(-20, -40, -30, 40));
        System.out.println(max(-20, -10, -40, 40));
        System.out.println(max(-20, -10, -30, -40));
    }
}
