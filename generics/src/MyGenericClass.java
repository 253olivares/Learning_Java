// Bound types lets us but contraint on generics  doing so will limit some input types when dealing with generic
// for exable extending the generic type T here we extend it with number
// so now whatever is passed to our class the first value has to be some type of number
// it can be a integer or a double
public class MyGenericClass<T extends Number, V> {
    T x;
    V y;

    MyGenericClass(T x) {
        this.x = x;
    }

    MyGenericClass(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getValue() {
        return x;
    }
}
