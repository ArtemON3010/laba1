package Task10;

public class Weather {
    private int temperature;
    private String typeOfWeather;


    public Weather() {
        this.temperature = 0;
        this.typeOfWeather = "Sunny";
    }

    public Weather(final int temperature, final String typeOfWeather) {
        this.temperature = temperature;
        this.typeOfWeather = typeOfWeather;

    }

    public int getTemperature() {
        return temperature;
    }

    public String getTypeOfWeather() {
        return typeOfWeather;
    }


    public void setTemperature(final int temperature) {
        this.temperature = temperature;
    }

    public void setTypeOfWeather(final String typeOfWeather) {
        this.typeOfWeather = typeOfWeather;
    }


    @Override
    public boolean equals(final Object obj) {
        if (obj == this) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;

        final Weather weather = (Weather) obj;
        return this.getTemperature() == weather.getTemperature()
                && (this.getTypeOfWeather() == weather.getTypeOfWeather()
                || (this.getTypeOfWeather() != null && this.getTypeOfWeather().equals(weather.getTypeOfWeather())));


    }

    @Override
    public int hashCode() {
        return 123 * this.getTemperature() +
                123 * this.getTypeOfWeather().hashCode();

    }

    @Override
    public String toString() {
        return " It's " + getTypeOfWeather()
                + " outside. Approximately " + getTemperature() + " degrees.";
    }

}
