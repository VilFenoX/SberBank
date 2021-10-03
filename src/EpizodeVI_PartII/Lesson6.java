package EpizodeVI_PartII;

public class Lesson6 {
    public static void main(String[] args) {

    }

    public class Jedi {
        private String name;
        private int age;
        public String rank;

        public Jedi(String name, int age, String rank) {
            this.name = name;
            this.age = age;
            this.rank = rank;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
