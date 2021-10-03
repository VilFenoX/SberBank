package EpizodeIV_PartI;

public class Lesson3 {
    public static void main(String[] args) {

    }
    static class Force{
        public static int theForce = 0;
        public Force() {
            theForce++;
        }
        protected void finalize() throws Throwable{
            theForce--;
        }
    }
}
