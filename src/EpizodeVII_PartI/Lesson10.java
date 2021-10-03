package EpizodeVII_PartI;

public class Lesson10 {
    public static void main(String[] args) {
        Padavan padavan = new Padavan();
        System.out.println(padavan);
    }
    public static interface YodaStyle {
        public void workHard();
    }

    public static class Padavan extends Jedi implements YodaStyle {
    }
   static class Jedi implements YodaStyle{

        @Override
        public void workHard() {
            System.out.println(" ");
        }
    }
}
