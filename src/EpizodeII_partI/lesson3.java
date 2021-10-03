package EpizodeII_partI;

public class lesson3 {
    public static void main(String[] args) {
        Zam zam = new Zam();
        Dron dron = new Dron();
        zam.spy = dron;
        dron.hunter = zam;//напишите тут ваш код
    }
    public static class Zam {
       String name;
       int age;
        Dron spy; //напишите тут ваш код
    }
    public static class Dron {
        String name;
        int age;
       Zam hunter; //напишите тут ваш код
    }
}
