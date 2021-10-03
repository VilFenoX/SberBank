package EpizodeV_PartII;

import java.io.FileNotFoundException;
import java.net.SocketException;

public class Lesson11 {
    public static void main(String[] args) {
    }
    static class MyException extends SocketException {
        public MyException(String message){
            super(message);
        }
    }
    static class MyException2 extends FileNotFoundException {
        public MyException2(String message){
            super(message);
        }
    }
    static class MyException3 extends ArithmeticException{
        public MyException3(String message){
            super(message);
        }
    }
    static class MyException4 extends IndexOutOfBoundsException{
        public MyException4(String message){
            super(message);
        }
    }
}
