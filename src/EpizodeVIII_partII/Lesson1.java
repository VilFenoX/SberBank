package EpizodeVIII_partII;

public class Lesson1 {
    public static class MagmaGuard extends Droid {
        protected String getName() {
            return ("I am a MagmaGuard " + super.getName());
        }
    }

    public static class GalaticMarine extends Clone {
        protected String getName() {
            return ("I am a GalaticMarine " + super.getName());
        }
    }
    public static void main(String[] args) {

    }

    public static class Droid {
        protected String getName() {
            return "I am a Droid";
        }
    }

    public static class Clone {
        String getName() {
            return "I am a Clone";
        }
    }
}
