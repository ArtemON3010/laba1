package Task8;

public class Main {
    public static void main(final String[] args) {

        final CustomDouble number1 = new CustomDouble(true, 2, 0.3);
        final CustomDouble number2 = new CustomDouble(false, 4, -0.1);

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        System.out.println("The sum of num1 and num 2 = " + number1.addition(number2));
        System.out.println("The difference of num1 and num2 = " + number1.division(number2));

        System.out.println("number1 > number2?: " + number1.more(number2));
        System.out.println("number1 < number2?: " + number1.less(number2));
        System.out.println("number1 > number2?: " + number1.moreEqual(number2));
        System.out.println("number1 <= number2?: " + number1.lessEqual(number2));
        System.out.println("number1 != number2?: " + number1.nonEqual(number2));

        System.out.println("number1 == number2: " + number1.equals(number2));

        final CustomDouble number3 = new CustomDouble(true, 1, 0.1);
        final CustomDouble number4 = new CustomDouble(true, 1, 0.1);

        System.out.println("number3 = " + number3);
        System.out.println("number4 = " + number4);

        System.out.println("number3 == number4: " + number3.equals(number4));

        System.out.println(number2.toDouble());

    }
}
