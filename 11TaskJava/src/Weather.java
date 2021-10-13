public class Weather {
    public Weather() {

    }

    public Weather(Weather weather) {
        this.windy = weather.windy;
        this.degrees = weather.degrees;
        this.hummunity = weather.hummunity;
    }

    public String getWindy() {
        return windy;
    }

    public Weather(String windy, int degrees, int hummunity) {
        this.windy = windy;
        this.degrees = degrees;
        this.hummunity = hummunity;
    }

    public void setWindy(String windy) {
        this.windy = windy;
    }

    public int getDegrees() {
        return degrees;
    }

    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }

    public int getHummunity() {
        return hummunity;
    }

    public void setHummunity(int hummunity) {
        this.hummunity = hummunity;
    }

    @Override
    public String toString() {
        return "Wind = " + windy + "\nDegrees = " + degrees +" gr Celcium\n"+ "Hummunity = " + hummunity + "%";
    }

    private String windy;
    private int degrees;
    private  int hummunity;
}
