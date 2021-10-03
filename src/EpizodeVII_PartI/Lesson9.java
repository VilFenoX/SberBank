package EpizodeVII_PartI;

public class Lesson9 {
    public static void main(String[] args) {
        Sith sith = new Youngling();
        sith.setSide("I am choosing the Light Side");
        System.out.println(sith.getSide());
    }
    public static class Sith {
        protected String side;
        public Sith() {
        }
        public String getSide() {
            return side;
        }
        public void setSide(String side) {
            this.side = side;
        }
    }
    public static class Youngling extends Sith {
        @Override
        public void setSide(String side) {
            this.side = "I am choosing the Dark Side";
        }
    }
}
