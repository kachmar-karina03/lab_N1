public class Day {
    private Weather weather = new Weather();

    public Day(Weather weather, int number) {
        this.weather = weather;
        this.number = number;
    }

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = new Weather(weather);
    }
}
