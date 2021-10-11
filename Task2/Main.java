package Task2;

public class Main {
    public static void main(final String[] args) {
        final String[] strArray = {"some string","apple","sausages","statistics"};
        System.out.println("This is our entered string array:");
        Print(strArray);

        System.out.println("");

        symbolCount(strArray, 's');
}

    //Method, which prints our string array
    public static void Print(final String[] strArray) {
        for (final String str : strArray) {
            System.out.println(str);
        }
    }

    //Method, which counts entries of certain symbol
    public static void symbolCount(final String[] input, final char search) {
        final String str = String.join(",", input);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == search)
                count++;
        }
        System.out.println("There are " + count + " entries of \'" + search + "\' symbol.");

    }
}
