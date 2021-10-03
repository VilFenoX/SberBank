package EpizodeVIII_partII;

public class Lesson10 {
    public static Jedi jedi;

    static {
        Jedi jedi = new Jedi();
        jedi.name = "Anakin";
        System.out.println(jedi.name);
    }

    public static void main(String[] args) {

    }

    public static class Jedi {
        public String name;
    }
}
