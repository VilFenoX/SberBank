package EpizodeVII_PartII;

public class Lesson3 {
    public static void main(String[] args) throws Exception {
    }
    interface Person {
        void use(Person person);
        void startToTrain();
    }
    interface Trained {
        boolean wantsToGetExtraTrain();
    }
    interface Padavan extends Person{

    }
    interface Jedi extends Person , Trained{

    }
    class ExperiencedHuman implements Jedi {
        public void use(Person person) {
            person.startToTrain();
        }
        public void startToTrain() {
        }
        public boolean wantsToGetExtraTrain() {
            return true;
        }
    }
    class NotExperiencedHuman implements Padavan{
        public void use(Person person) {
        }
        public void startToTrain() {
        }
    }
}
