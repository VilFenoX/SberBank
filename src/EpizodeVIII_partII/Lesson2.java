package EpizodeVIII_partII;

public class Lesson2 {
    public static void main(String[] args) {
    }

    public static class MultiTroopTranspor {
        public void printlnUsage() {
            System.out.println(Constants.MTT);//add your code here
        }
    }

    public static class AllTerrainArmoredTransport {
        public void printlnUsage() {
            System.out.println(Constants.ATAT);//add your code here
        }
    }

    public static class Constants {
        public static String MTT = "I can transport drones";
        public static String ATAT = "I can shot";
        public static String RESISTANCE = "I am from Resistance";
        public static String FIRSTORDER = "I am from First Order";
    }

    public static class Resistance {
        protected void printUsage() {
            System.out.print(Constants.RESISTANCE);
        }
    }

    public static class FirstOrder {
        protected void printUsage() {
            System.out.print(Constants.FIRSTORDER);
        }
    }
}
