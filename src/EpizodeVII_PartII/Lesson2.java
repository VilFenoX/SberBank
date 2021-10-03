package EpizodeVII_PartII;

public class Lesson2 {
    public static void main(String[] args) {

    }
    interface StarKiller{
        default String Destroy(){
            return "Ob`ect unichtozhen";
        }
    }
    interface Presentable extends StarKiller{

    }
}
