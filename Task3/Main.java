package Task3;

public class Main {

    public static void main(final String[] args) {
        final int[] newInt = {1,0,2,9,3,8};
        final char[] newChar = {'q','z','w','x','e','c'};

        System.out.println("New string array,created from int and char ones:");
        arrayCharInt(newInt, newChar);
    }

    //Method, which creates new string from char and int arrays
    public static void arrayCharInt(final int[] intArray, final char[] charArray) {
        final int size = Math.max(intArray.length, charArray.length);
        String newStrArray = "";

        for (int i = 0; i < size; i++) {
            if( i < intArray.length) {

                newStrArray += "" + intArray[i];
            }
            if(i < charArray.length) {

                newStrArray += "" + charArray[i];
            }

        }
        System.out.print(newStrArray);

    }
}
