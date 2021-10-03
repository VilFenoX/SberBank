package EpizodeVIII_partII;

public class Lesson4 {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        printName(man);
        printName(woman);
    }
    public static void printName(Human man) {
    }
    public static class Human {
    }
    public static class Man extends Human{
    }
    public static class Woman extends Human{
    }
}
