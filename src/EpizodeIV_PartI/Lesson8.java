package EpizodeIV_PartI;

public class Lesson8 {
    public static void main(String[] args) {
        printMessage(new ItsMessage());
    }
    public static class ItsMessage{
        public String getDescription(){
            return "Hello";
        }
    }
    public static void printMessage(ItsMessage itsMessage){
        itsMessage.getDescription();
    }

}
