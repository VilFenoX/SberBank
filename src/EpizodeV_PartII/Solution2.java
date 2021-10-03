package EpizodeV_PartII;

import java.io.IOException;
import java.rmi.RemoteException;

public class Solution2 {
    public static void main(String[] args) {
        handleExceptions(new Solution2());
    }
    public static void handleExceptions(Solution2 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (IOException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
    public void method1() throws IOException {
        throw new IOException();
    }
    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }
    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
