package EpizodeIII_PartII;

public class Lesson7 {
    public static void main(String[] args) {

    }
    class Tunnel{
        int centerX;
        int centerY;
        int radius;
        int width;

        public void initialize(int centerX, int centerY) {
            this.centerX = centerX;
            this.centerY = centerY;
        }

        public void initialize(int centerX, int centerY, int radius) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
        }

        public void initialize(int centerX, int centerY, int radius, int width) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
        }
    }
}
