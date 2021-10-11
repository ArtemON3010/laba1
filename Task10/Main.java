package Task10;

public class Main {
    public static void main(final String[] args) {

        final Day day1 = new Day(15,"Sunny","Monday");
        final Day day2 = new Day(20,"Rainy","Saturday");
        final Day day3 = new Day(30,"Scorching","Sunday");

        System.out.println("Description of day1:" + day1.toString());

        System.out.println("Description of day2:" + day2.toString());

        System.out.println("Description of day3:" + day3.toString());

        final Day day4 = new Day(22,"Rainy","Monday");
        final Day day5 = new Day(22,"Rainy","Monday");

        System.out.println("day4 == day5? " + day4.equals(day5));
        System.out.println("Description of day4:" + day4.toString());
        System.out.println("Description of day5:" + day5.toString());

    }
}
