package Task10;

public class Day {
    private Weather weather = new Weather();
    private String dayOfTheWeek;

    public Day(final int temperature, final String typeOfWeather, final String dayOfTheWeek) {
        this.weather.setTemperature(temperature);
        this.weather.setTypeOfWeather(typeOfWeather);
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public Weather getWeather() {
        return weather;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;

        final Day day = (Day) obj;
        return this.getDayOfTheWeek().equals(day.getDayOfTheWeek());
    }

    @Override
    public int hashCode() {
        return this.getWeather().hashCode() + 7 * getDayOfTheWeek().hashCode();
    }

    @Override
    public String toString() {
        return "Today is " + getDayOfTheWeek() + ". It's " + getWeather().getTypeOfWeather()
                + " outside. Approximately " + getWeather().getTemperature() + " degrees.";
    }
}
