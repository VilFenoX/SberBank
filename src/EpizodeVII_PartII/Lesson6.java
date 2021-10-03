package EpizodeVII_PartII;

public class Lesson6 {
    public static void main(String[] args) throws Exception {
    }
    public interface Weapon {
        Power getPower();
    }
    abstract public static class Starkiller implements Weapon{
        public String getName() {
            return "Starkiller";
        }
    }
}
