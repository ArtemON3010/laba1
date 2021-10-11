package Task5;

public class Main {
    public static void main(final String[] args) {

        final Matrix matrix = new Matrix();

        System.out.println("\n Our matrix: \n" );
        matrix.PrintM();

        System.out.println("\nTransposed matrix: \n" );
        (matrix.Transposition()).PrintM();
    }
}
