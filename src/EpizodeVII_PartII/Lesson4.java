package EpizodeVII_PartII;

public class Lesson4 {
    public static void main(String[] args) throws Exception {
        ShirivukTranslator shirivukTranslator = new ShirivukTranslator();
        System.out.println(shirivukTranslator.translate());
    }
    public static abstract class Translator {
        public abstract String getLanguage();
        public String translate() {
            return "I am " + getLanguage() + " translator";
        }
    }
    static class ShirivukTranslator extends Translator{

        @Override
        public String getLanguage() {
            return "shirivuk";
        }
    }
}
