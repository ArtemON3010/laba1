package Task11;

import java.util.ArrayList;
import java.util.Objects;

public class Client {
    private String name;
    private String surname;
    private String phoneNumber;
    ArrayList<Order> orders;

    public Client(){
        this.name = "";
        this.surname = "";
        this.phoneNumber = "";
        this.orders = new ArrayList<>();
    }
    public Client(final String name, final String surname, final String phoneNumber, final ArrayList<Order> orders) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.orders = orders;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(final ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void giveOrder(final Order order) {
        orders.add(order);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(surname, client.surname) &&
                Objects.equals(phoneNumber, client.phoneNumber) && Objects.equals(orders, client.orders);
    }

    @Override
    public int hashCode() {
        return 123 * Objects.hash(name, surname, phoneNumber, orders);
    }
}
