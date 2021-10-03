package EpizodeV_PartII;

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());
    }

    public static void handleExceptions(Solution obj) {
        for (int i=0; i<3; i++ ){
            try{
                switch(i){
                    case 0:
                        obj.method1();
                    case 1:
                        obj.method2();
                    case 2:
                        obj.method3();
                }
            }
            catch(Exception e){
                printStack(e);
            }
        }
    }
    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }
    public void method1(){
        throw new NullPointerException();
    }
    public void method2(){
        throw new IndexOutOfBoundsException();
    }
    public void method3(){
        throw new NumberFormatException();
    }
}
