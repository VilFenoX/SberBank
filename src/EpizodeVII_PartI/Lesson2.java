package EpizodeVII_PartI;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new AZI3()));
        System.out.println(getObjectType(new B21()));
        System.out.println(getObjectType(new IG88()));
        System.out.println(getObjectType(new R2D2()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof AZI3) {
            return "AZI-3";
        }
        else if (o instanceof B21) {
            return "2-1B";
        }
        else if (o instanceof IG88) {
            return "IG-88";
        }
        else if (o instanceof R2D2) {
            return "R2D2";
        }
        else
            return "Неизвестный робот";
    }

    public static class AZI3 {
    }

    public static class B21 {
    }

    public static class IG88 {
    }

    public static class R2D2 {
    }
}

