package EpizodeVII_PartI;

public class Lesson7 {
    public static void main(String[] args) {
    }

    public static abstract class Predator {
        public abstract String getName();
    }

    public static class Rathtar extends Predator {
        private String name = "Rathtar";

        public String getName() {
            return this.name;
        }
        }
    }

