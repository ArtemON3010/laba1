package Task6;

public class Main {
    public static void main(final String[] args) {

        final Matrix matrix1 = new Matrix();
        final Matrix matrix2 = new Matrix();

        System.out.println("\n Our matrix1: \n" );
        matrix1.PrintM();

        System.out.println("\n Our matrix2: \n" );
        matrix2.PrintM();

        System.out.println("\nNew multiplied matrix: \n" );
        (matrix1.Multi(matrix2)).PrintM();
    }
}
