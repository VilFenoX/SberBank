package EpizodeIII_PartII;

public class Lesson4 {
    public static void main(String[] args) {
        class Jedi{
            String name;
            int count;
            String weapon;

            public void initialize(String name) {
                this.name = name;
            }

            public void initialize(String name, int count) {
                this.name = name;
                this.count = count;
            }

            public void initialize(String name, int count, String weapon) {
                this.name = name;
                this.count = count;
                this.weapon = weapon;
            }
        }
    }
}
