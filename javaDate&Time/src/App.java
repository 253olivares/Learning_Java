import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        // Java Dates
        // Java does not have a built in date class, but we can import the java.time
        // package to work with date and time API. The package includes many date and
        // time classes
        // For example:
        // LocalDate : Represents a date (year, month, day(yyyy-MM-dd))
        // LocalTime : Represents a time (hour, minute, second, and
        // nanoseconds(HH-mm-ss-ns))
        // LocalDateTime : Represents both date and a time (yyyy-MM-dd-HH-mm-ss-ns)
        // DateTimeFormatter Formatter for displaying and parsing date-time objects

        // display Current Date
        LocalDate myObj = LocalDate.now(); // create our date object
        System.out.println("Current Date: " + myObj);

        // display current Time:
        LocalTime myObj2 = LocalTime.now();
        System.out.println("Current Time: " + myObj2);

        // Display Current Date and Time
        LocalDateTime myObj3 = LocalDateTime.now();
        System.out.println("Current Date & Time: " + myObj3);

        // Formatting Date and Time
        // When looking at a date and time object the value will display a T
        // this signifies where the date and and time begins in the provided value

        // Using DateTimeFormatter with the ofPattern() Method we can format or pase
        // date time objects
        // ex:
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Our local Date and Time: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

        // The ofPettern() method accepts a couple different type of values, if you want
        // to display the date and time in different formats
        // format 1 : 'yyyy-MM-dd'
        // format 2: 'dd/MM/yyyy'
        // format 3: 'dd-MMM-yyyy'
        // format 4: 'E, MMM dd yyyy'
    }
}
