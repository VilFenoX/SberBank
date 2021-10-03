package EpizodeVII_PartII;

public class Lesson7 {
    public static void main(String[] args) throws Exception {
        Solo Ren = new Ren();
        System.out.println(Ren.getName());
        System.out.println(Ren.getSwordColor());
    }
    public interface Sith {
        SwordColor getSwordColor();
    }
    public static abstract class Solo implements Sith {
        public String getName() {
            return "Kylo";
        }
    }
    public static class Ren extends Solo {
        public SwordColor SwordColor() {
            return SwordColor.RED;
        }

        @Override
        public SwordColor getSwordColor() {
            return null;
        }
    }
}
