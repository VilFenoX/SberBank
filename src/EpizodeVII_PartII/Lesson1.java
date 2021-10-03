package EpizodeVII_PartII;

public class Lesson1 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public class Screen implements Selectable, Updatable {
        public void onSelect() {

        }

        public void refresh() {

        }
    }
}
