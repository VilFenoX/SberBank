package EpizodeIII_PartII;

public class Lesson3 {
    public static void main(String[] args) {
       Jedi jedi1 = new Jedi("obi", 333, 198, "Human"); //напишите тут ваш код
       Jedi jedi2 = new Jedi("obi", 333, 198, "Human"); //напишите тут ваш код
       Jedi jedi3 = new Jedi("obi", 333, 198, "Human"); //напишите тут ваш код
    }
    public static class Jedi {
        private String name;
        private int age;
        private String race;
        private int height;
        public Jedi(String name, int age, int height, String race) {
            this.name = name;
            this.age = age;
            this.race = race;
            this.height = height;
        }
    }
}
