import javax.print.DocFlavor.READER;

public class App {
    public static void main(String[] args) throws Exception {
        // generics = enables types (classes and interfaces) to be parameters when
        // defining
        // classes, interfaces, and methods
        // a benefit is to elimiate the need to create multiple versions
        // of methods of classes for various data types
        // use 1 version for all reference data types

        int[] intArray = { 1, 2, 3, 4, 5 };
        double[] doubleArray = { 5.5, 4.4, 3.3, 2.2, 1.1 };
        char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
        String[] stringArray = { "B", "y", "e", "!" };

    }

    // generics allow us to be flexiable with the data we supply

    // normally we would do this if we got diffrent data that needs to be passed
    // through the same function
    // public static void displayArray(int[] array){
    // for(int x : array) {
    // System.out.print(x+ " ");
    // }
    // System.out.println();
    // }
    // public static void displayArray(double[] array){
    // for(double x : array) {
    // System.out.print(x+ " ");
    // }
    // System.out.println();
    // }

    // public static void displayArray(char[] array){
    // for(char x : array) {
    // System.out.print(x+ " ");
    // }
    // System.out.println();
    // }

    // generics allows us to unify out code and be more leniant as long as every
    // time we refrence
    // the code we tell java it continues to be generic

    public static <T> void displayArray(T[] array) {
        for (T x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <T> T returnThing(T[] array) {
        return array[0];
    }

}
