package Task1;

public class Main {
    public static void main(final String[] args) {
        final String[] strArray = {"Structure","Appropriate","Array","Integer","One","Up"};
        System.out.println("This is our entered string array:");
        Print(strArray);

        SortString(strArray);
        System.out.println("This is the same string array,but ordered one:");

        Print(strArray);
    }

    //Method, which prints our string array
    public static void Print(final String[] strArray) {
        for (final String str : strArray) {
            System.out.println(str);
        }
    }

    //Method, which sorts our string array
    public static void SortString(final String[] strArray) {
        for (int i = 1; i < strArray.length; i++) {
            final String temp = strArray[i];

            int j = i - 1;
            while (j >= 0 && temp.length() < strArray[j].length()) {
                strArray[j + 1] = strArray[j];
                j--;
            }
            strArray[j + 1] = temp;
        }

    }
}
