package EpizodeV_PartII;

public class Lesson8 {
    public static void main(String[] args) throws Exception {
        try {
            method1(); //напишите тут ваш код
        } catch (Exception e) {
            e.printStackTrace();
        }

        //напишите тут ваш код
    }
    public static void method1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);
        if (i == 0) {
            throw new Exception1();
        } else if (i == 1) {
            throw new Exception2();
        } else if (i == 2) {
            throw new Exception3();
        }
    }
}
class Exception1 extends Exception {
}
class Exception2 extends Exception1 {
}
class Exception3 extends Exception2 {
}
