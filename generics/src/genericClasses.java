public class genericClasses {
    public static void main(String[] args) {
        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14);
        // after adding extends theses instances will no longer work
        MyGenericClass<Character, Character> myChar = new MyGenericClass<>('$');
        MyGenericClass<String, Integer> myString = new MyGenericClass<>("Hello");
    }
}
