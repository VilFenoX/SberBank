package EpizodeVI_PartII;

public class Lesson10 {
    public static void main(String[] args) {

    }
    abstract class ForceUser{
        abstract void UseForce();
    }
    class Jedi extends ForceUser{

        @Override
        void UseForce() {
            System.out.println("push item");
        }
    }
    class  Sith extends ForceUser{

        @Override
        void UseForce() {
            System.out.println("use the lightning");
        }
    }

}
