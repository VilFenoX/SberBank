package EpizodeIV_PartI;

public class CloneTroopers {
    private static int cloneCount = 0;
    public CloneTroopers() {
        cloneCount++;
    }
    public static int getCloneCount() {
        return cloneCount;//напишите тут ваш код
    }
    public static void setCloneCount(int cloneCount) {
      cloneCount = cloneCount;
    }
    public static void main(String[] args) {
    }
}
