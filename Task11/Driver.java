package Task11;
import java.util.Objects;

public class Driver {
    private String name;
    private String surname;
    private int starsOnUber;

    public Driver(final String name, final String surname, final int starsOnUber) {
        this.name = name;
        this.surname = surname;
        this.starsOnUber = starsOnUber;
    }

    public int getStarsOnUber() {
        return starsOnUber;
    }

    public void setStarsOnUber(final int starsOnUber) {
        if(starsOnUber<= 5 && starsOnUber>=1) {
            this.starsOnUber = starsOnUber;
        }
        else{
            throw new RuntimeException("I think your car driver has a wromg count of stars on Uber");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Driver driver = (Driver) o;
        return Objects.equals(name, driver.name) && Objects.equals(surname, driver.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return  this.getName() + ' ' +  this.getSurname();
    }


}
