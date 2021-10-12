package Task11;

public class Main {
    public static void main(final String[] args) {

        final Driver[] drivers = new Driver[2];

        drivers[0] = new Driver("Sasun", "Merzoyanov",4);
        drivers[1] = new Driver("Artem", "Turko",5);

        final Car taxiCar = new Car("Mitsubishi","V666V","Black" ,3, drivers);

        System.out.println(taxiCar);




    }
}
