package EpizodeVIII_PartI;

public class Lesson2 {
    public static void main(String[] args) {
        Animal animal = new Porg();
        boolean isPorg = animal instanceof Porg;
        boolean isMovable = animal instanceof CanMove;
        boolean isAnimal = animal instanceof Animal;
        if (isPorg && isMovable && isAnimal) System.out.println("Ahhh!");
    }
    interface CanMove {
    }
    static class Animal implements CanMove {
    }
    static class Porg extends Animal {
    }
}
