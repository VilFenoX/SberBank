package EpizodeVI_PartII;

public class Lesson9 {
    public static void main(String[] args) {
    }
    public class Jedi {
        public String name;
        public int age;
        public String rank;
        public int power;
        public Jedi(String name, int age, String rank, int power) {
            this.name = name;
            this.age = age;
            this.rank = rank;
            this.power = power;
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

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }
    }
}
