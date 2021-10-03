package EpizodeVIII_PartI;

public class Singleton {
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){ // #3
        if(instance == null){		//если объект еще не создан
            instance = new Singleton();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }
}
