package Task7;

public class Main {
    public static void main(final String[] args) {

        final User user1 = new User("Artem","Turko",18,"wqrecvf@gmail.com");
        final User user2 = new User("Maxim","Maximiuk",20,"fwoeojjfgpig@ukr.net");

        System.out.println("Are user1 equal to user2? " + user1.equals(user2));

        final User user3 = new User("Petro","Petrenko",15,"petro15@gmail.com");
        final User user4 = new User("Petro","Petrenko",15,"petro15@gmail.com");

        System.out.println("Are user3 equal to user4? " + user3.equals(user4));

    }
}
