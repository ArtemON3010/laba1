package Task9;
import Task8.CustomDouble;

public class Main {
    public static void main(final String[] args) {
        final CustomDouble number1 = new CustomDouble(true, 2, 0.3);
        final CustomDouble number2 = new CustomDouble(false, 4, -0.1);

        System.out.println("number1= " + number1);
        System.out.println("number2= " + number2);

        final Calculator calculator = new Calculator();

        System.out.println("number1 + number2 = " + calculator.operations(number1, '+', number2));
        System.out.println("number1 - number2 = " + calculator.operations(number1, '-', number2));
        System.out.println("number1 * number2 = " + calculator.operations(number1, '*', number2));
        System.out.println("number1 / number2 = " + calculator.operations(number1, '/', number2));

    }
}
