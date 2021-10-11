package Task11;
import java.util.ArrayList;
import java.util.Objects;

public class Order {
    private int orderNumber;
    private int price;
    private int countOfPassengers;
    private int timeToArrival;
    private Car taxiCar;
    private Client client;

    public Order(){
        this.orderNumber = 0;
        this.price = 0;
        this.countOfPassengers = 0;
        this.timeToArrival  = 0;
        final Driver[] drivers = new Driver[0];
        this.taxiCar = new Car("","","",0,drivers);
        this.client = new Client("","","",new ArrayList<>());

    }
    public Order(final int orderNumber, final int price, final int countOfPassengers,final int timeToArrival,
                 final Car taxiCar, final Client client) {
        this.orderNumber = orderNumber;
        this.price = price;
        this.countOfPassengers = countOfPassengers;
        this.timeToArrival  = timeToArrival;
        this.taxiCar = taxiCar;
        this.client = client;
    }

    public int getTimeToArrival() {
        return timeToArrival;
    }

    public void setTimeToArrival(final int timeToArrival) {
        this.timeToArrival = timeToArrival;
    }
    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(final int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(final int countOfPassengers) {
        if(countOfPassengers == taxiCar.getCapacity() && taxiCar.getCapacity() >= 2)
            this.countOfPassengers = countOfPassengers;
        else
            throw new ArithmeticException("There is only " + taxiCar.getCapacity() + "seats");
    }

    public Car getTaxiCar() { return taxiCar; }

    public void setTaxiCar(final Car taxiCar) {
        this.taxiCar = taxiCar;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(final Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Order order = (Order) o;
        return orderNumber == order.orderNumber && price == order.price && countOfPassengers == order.countOfPassengers
                && timeToArrival == order.timeToArrival && Objects.equals(taxiCar, order.taxiCar)
                && Objects.equals(client, order.client);
    }

    @Override
    public int hashCode() {
        return 123 * Objects.hash(orderNumber, price, countOfPassengers,timeToArrival, taxiCar, client);
    }


}

