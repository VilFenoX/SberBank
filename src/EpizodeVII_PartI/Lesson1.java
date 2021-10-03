package EpizodeVII_PartI;

public class Lesson1 {
    public static void main(String[] args) {
        Empire empire = new Order();
        System.out.println(empire.getName());
    }
    public static class Empire {
        public String getName() {
            return "Fall of the Galaxy Empire";
        }
    }
    public static class Order extends Empire {
        @Override
        public String getName() {
           return "Rise of the First Order";
        }
    }
}
