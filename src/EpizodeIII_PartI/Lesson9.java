package EpizodeIII_PartI;

public class Lesson9 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        while (j < 10) {
            while (i < 10) {
                System.out.print(i*j + " ");
                i++;
            }
            j++;
            System.out.println();
            i =1;
        }
    }
}
