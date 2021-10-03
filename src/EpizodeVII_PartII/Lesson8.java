package EpizodeVII_PartII;

public class Lesson8 {
    public static void main(String[] args) {
    }
    public interface Swordfight {
        void swordfight();
    }
    public interface Shoot {
        void shoot();
    }
    public interface Force {
        void force();
    }
    class Finn implements Shoot,Swordfight{

        @Override
        public void swordfight() {

        }

        @Override
        public void shoot() {

        }
    }
    class Rey implements Force, Shoot{

        @Override
        public void shoot() {

        }

        @Override
        public void force() {

        }
    }
    class Ren implements Swordfight, Force{

        @Override
        public void swordfight() {

        }

        @Override
        public void force() {

        }
    }
}
