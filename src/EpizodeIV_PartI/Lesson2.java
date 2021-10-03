package EpizodeIV_PartI;

public class Lesson2 {
    public static void main(String[] args) {

    }
    class Jedi{
        protected void finalize() throws Throwable{
            System.out.println("A Jedi was destroyed");
        }
    }
    class Sith{}
        protected void finalize() throws Throwable{
            System.out.println("A Sith was destroyed");
    }
}
