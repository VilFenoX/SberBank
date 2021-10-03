package EpizodeIV_PartII;

public class Galactic {
    public static void main(String[] args) {
        Jedi jedi = new Jedi("Yoda", true, 900);
        System.out.println(jedi);
        Jedi jedi1 = new Jedi("Ikrit", true, 507, jedi.name);
        System.out.println(jedi1);
        Jedi jedi2 = new Jedi("Cin Drallig", true, 88, jedi.name);
        System.out.println(jedi2);
        Jedi jedi3 = new Jedi("Qui-Gon Jinn", true, 60, jedi.name);
        System.out.println(jedi3);
        Jedi jedi4 = new Jedi("Obi-Wan Kenobi", true, 57, jedi3.name);
        System.out.println(jedi4);
        Jedi jedi5 = new Jedi("Luke Skywalker", true, 66, jedi4.name);
        System.out.println(jedi5);
        Jedi jedi6 = new Jedi("Leia Organa", false, 55, jedi5.name);
        System.out.println(jedi6);
        Jedi jedi7 = new Jedi("Anakin Skywalker", true, 45, jedi4.name);
        System.out.println(jedi7);
        Jedi jedi8 = new Jedi("Galen", true, 17, jedi7.name);
        System.out.println(jedi8);
    }

    public static class Jedi {
        private String name;
        private boolean sex;
        private int age;
        private String teacher;


        public Jedi(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Jedi(String name, boolean sex, int age, String teacher){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.teacher = teacher;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.teacher != null) {
                text += ", учитель: " + this.teacher;
            }
            return text;
        }
    }
}
