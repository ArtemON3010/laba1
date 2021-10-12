package Task9;
import Task8.CustomDouble;

public class Calculator {

    public double operations(final CustomDouble a, final char symbol, final CustomDouble b) {
        switch (symbol) {
            case '+':
                return a.addition(b).toDouble();
            case '-':
                return a.subtraction(b).toDouble();
            case '*':
                return a.multiplying(b).toDouble();
            case '/':
                return a.division(b).toDouble();
            default:
                throw new UnsupportedOperationException("Error: wrong symbol!");
        }
    }
}
