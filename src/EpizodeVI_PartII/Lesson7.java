package EpizodeVI_PartII;

public class Lesson7 {
    public static void main(String[] args) {
    }
    public class Jedi {
        private String name;
        private int age;
        private String rank;

        public Jedi(String name, int age, String rank) {
            this.name = name;
            this.age = age;
            this.rank = rank;
        }
        public String getName() {
            return name;
        }
        private void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        private void setAge(int age) {
            this.age = age;
        }
    }
}
