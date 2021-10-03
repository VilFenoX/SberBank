package EpizodeII_partI;

public class Lesson6 {
    public static void main(String[] args) {
        Clone1 clone1 = new Clone1();//напишите тут ваш код
        Clone2 clone2 = new Clone2();//напишите тут ваш код
        Clone3 clone3 = new Clone3();
        Dias dias = new Dias();
        clone1.owner = dias;//напишите тут ваш код
        clone2.owner = dias;//напишите тут ваш код
        clone3.owner = dias;//напишите тут ваш код
    }
    public static class Clone1 {
        public Dias owner;
    }
    public static class Clone2 {
        public Dias owner;
    }
    public static class Clone3 {
        public Dias owner;
    }
    public static class Dias {
    }
}
