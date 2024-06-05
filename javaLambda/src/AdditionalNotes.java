import java.util.ArrayList;
import java.util.function.Consumer;

public class AdditionalNotes {
    public static void main(String[] args) {
        // Java Lambda Expression
        // Lambda expressions were added in Java 8
        // a Lambda expression is a short block of code which takes in params and
        // returns a value
        // Lambda expressions are similar to methods, but they do not need a name and
        // can be implemented right int he body od a method

        // The simplest lambda expression contains a single param and a expression
        // parameter -> expression

        // To use more than one parameter, wrap them in parentheses
        // (patameters1,parameters2) -> expressions

        // Expressions are limited. They have to immediately return avalue, and they
        // cannot contain ariables, assingments, or statements such as if or for. In
        // order to do more complex operations, a code block can be used with curly
        // braces. if lambda expresions need to return a value, then the code block
        // should have a return statement

        // Lambda expresions can be stored in varaibles if the variables type is an
        // interface which has only one method
        // the lambda expreions should have the same number of params and the same
        // return type as the method
        // Java has many of these kinds of interfaces built in, such as the consumer
        // interface

        // java consumer interface allows lambda expression storage in a variable

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(6);

        Consumer<Integer> method = (m) -> {
            System.out.println(m);
        };
        numbers.forEach(method);

    }
}
