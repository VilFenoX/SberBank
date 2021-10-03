package EpizodeVII_PartII;

public class Lesson10 {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }
    public interface WeatherType {
        String CLOUDY = "Cloudy";
        String FOGGY = "Foggy";
        String FREEZING = "Freezing";
    }
    public interface Weather {
        String getAkToWeatherType();
    }
    static class Today implements Weather{
        private String type;
        Today(String type) {
            this.type = type;
        }
        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getAkToWeatherType());
        }

        @Override
        public String getAkToWeatherType() {
            return this.type;
        }
    }
}
