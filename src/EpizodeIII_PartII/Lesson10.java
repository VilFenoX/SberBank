package EpizodeIII_PartII;

public class Lesson10 {
    public static void main(String[] args) {
     Jedi jedi1 = new Jedi("Obi1", 999999999); //напишите тут ваш код
        Jedi jedi = new Jedi("Obi2", 999999999); //напишите тут ваш код
        Jedi jedi3 = new Jedi("Obi5", 999,999999999); //напишите тут ваш код
        Jedi jedi4 = new Jedi("Obi6", 999,999999999); //напишите тут ваш код
        Jedi jedi5= new Jedi("Obi7", 999,999999999); //напишите тут ваш кодJedi jedi6 = new Jedi("Obi1", 999,999999999); //напишите тут ваш код
        Jedi jedi7 = new Jedi("Obi3", 999999999); //напишите тут ваш код
        Jedi jedi8 = new Jedi("Obi4", 9999999); //напишите тут ваш код
        Jedi jedi9 = new Jedi("Obi8", 9999, 99999999, "earth"," killer"); //напишите тут ваш код
        Jedi jedi10 = new Jedi("Obi9", 9999, 99999999, "earth"," killer"); //напишите тут ваш код
        Jedi jedi11 = new Jedi("Obi11", 9999, 99999999, "earth"," killer"); //напишите тут ваш код
        Jedi jedi12 = new Jedi("eniken", 25, 999999999, "human","Killer","Dark"); //напишите тут ваш код
    }
    static class Jedi {
        String name;
        int age;
        int midichlorians;
        String homeworld;
        String species;
        String sideForce = "light";

        public Jedi(String name, int midichlorians) {
            this.name = name;
            this.midichlorians = midichlorians;
        }

        public Jedi(String name, int age, int midichlorians) {
            this.name = name;
            this.age = age;
            this.midichlorians = midichlorians;
        }


        public Jedi(String name, int age, int midichlorians, String homeworld, String species) {
            this.name = name;
            this.age = age;
            this.midichlorians = midichlorians;
            this.homeworld = homeworld;
            this.species = species;
        }

        public Jedi(String name, int age, int midichlorians, String homeworld, String species, String sideForce) {
            this.name = name;
            this.age = age;
            this.midichlorians = midichlorians;
            this.homeworld = homeworld;
            this.species = species;
            this.sideForce = sideForce;
        }
    }
}
