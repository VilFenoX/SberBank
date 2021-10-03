package EpizodeVII_PartII;

public class Lesson5 {
    public static void main(String[] args) throws Exception {
        C3PO c3po = new C3PO();
        System.out.println(c3po.translate());
    }
    public static class C3PO {
        public String translate() {
            return "I am shirivuk translator";
        }
    }
}
