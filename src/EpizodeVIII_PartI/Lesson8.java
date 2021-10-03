package EpizodeVIII_PartI;

public class Lesson8 {
    public static void main(String[] args) {
        StarFighter starFighter = Shop.getStarFighter("TheStartSaber");
        starFighter.getSalesPerMonth();
        starFighter.getDescription();
    }
    static class Shop {
        static StarFighter getStarFighter(String classOfStringFighter) {
            StarFighter starFighter = null;

            if (classOfStringFighter.equals("TheStartSaber")) {
                return new TheStartSaberStarFighter();
            } else if (classOfStringFighter.equals("Chela")) {
                return new ChelaStarFighter();
            } else if (classOfStringFighter.equals("Aurek")) {
                return new AurekStarFighter();
            } else if (classOfStringFighter.equals("Talon")) {
                return new TalonStarFighter();
            } else {
                return starFighter;
            }
        }
    }
    abstract static class StarFighter{
        abstract int getSalesPerMonth();
        String getDescription(){
            return "StarFighter";
        }
    }

    static class TheStartSaberStarFighter extends StarFighter{

        @Override
        int getSalesPerMonth() {
return 20;
        }
        String getDescription(){
            return super.getDescription() + " Type - " +this.toString() + getDescription() + " purchases per month.";
        }
    }
    static class ChelaStarFighter extends StarFighter{

        @Override
        int getSalesPerMonth() {

            return 30;
        }
        String getDescription(){
            return super.getDescription() + " Type - " +this.toString() + getDescription() + " purchases per month.";
        }
    }
    static class AurekStarFighter extends StarFighter{

        @Override
        int getSalesPerMonth() {

            return 40;
        }
        String getDescription(){
            return super.getDescription() + " Type - " +this.toString() + getDescription() + " purchases per month.";
        }
    }
    static class TalonStarFighter extends StarFighter{

        @Override
        int getSalesPerMonth() {

            return 50;
        }
        String getDescription(){
            return super.getDescription() + " Type - " +this.toString() + getDescription() + " purchases per month.";
        }
    }
}
