package EpizodeV_PartII;

public class Lesson12 {
    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void divideByZero() {
        System.out.println(42 / 0);
    }
}
