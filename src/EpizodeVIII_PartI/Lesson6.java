package EpizodeVIII_PartI;

public class Lesson6 {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }
    abstract static class Drink{
        public void taste(){
            System.out.println("delicious");
        }
    }
    static class Wine extends Drink{
        public String getHolidayName(){
            return "Birthday";
        }
    }
    static class BubblyWine extends Wine{
        public String getHolidayName(){
            return "New Year";
        }
    }

    public static Drink getDeliciousDrink() {
return new Wine();
    }
    public static Wine getWine() {
return new Wine();
    }
    public static Wine getBubblyWine() {
        return new BubblyWine();
    }
}
