package EpozodeII_PartII;

public class Lesson9 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(322));
    }
    public static int sumDigitsInNumber(int number) {
        int sum = (number/100) + ((number - ((number/100)*100))/10) + ((number%100)%10);
        return sum;//Ваш код тут
    }
}
