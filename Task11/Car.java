package Task11;

import java.util.Arrays;
import java.util.Objects;

public class Car {
    private String model;
    private String number;
    private String color;
    private int capacity;
    private Driver[] driver;

    public Car(final String model,final String number,final String color, final int capacity,  final Driver[] driver) {
        this.model = model;
        this.number = number;
        this.color = color;
        this.capacity = capacity;
        this.driver = driver;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public void setNumber(final String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(final int capacity) {
        if (capacity >= 2)
            this.capacity = capacity;
        else {
            throw new ArithmeticException("Do you ride on the bike?");
        }
    }


    public Driver[] getDriver() {
        return driver;
    }

    public void setDriver(final Driver[] driver) {
        this.driver = driver;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Car taxi = (Car) o;

        return capacity == taxi.capacity && Objects.equals(number, taxi.number) && Objects.equals(color, taxi.color)
                && Objects.equals(model, taxi.model) && Arrays.equals(driver, taxi.driver) ;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(model,number,color, capacity );
        result = 123 * result + Arrays.hashCode(driver);
        return result;
    }

    @Override
    public String toString() {
        return "Model of Car: " + model + '\n' +
                "Color of Car: " + color + '\n' +
                "Number of Car: " + number + '\n' +
                "Capacity: " + capacity + '\n' +
                "Available drivers: "  + Arrays.toString(driver);
    }


}
