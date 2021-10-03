package EpizodeIII_PartII;

public class Lesson5 {
    public static void main(String[] args) {
        Jedi jedi = new Jedi();
        jedi.nitialize("Obi", 333, 550000000);

    }
        static class Jedi{
            String name;
            int age;
            int midichlorians;

            public void nitialize(String name, int age, int midichlorians) {
                this.name = name;
                this.age = age;
                this.midichlorians = midichlorians;
            }
        }
    }

