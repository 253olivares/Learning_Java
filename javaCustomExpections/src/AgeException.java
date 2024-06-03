import java.lang.Exception;

// extend our exception
public class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}
