import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        // Java Regular Expressions
        // What is a regular expression
        // A regular expression is a sequence of characters that forms a search pattern.
        // when you search for data in a text, you can use this search pattern to
        // describe what you are searching for

        // a regular expression can be a single character, or a more complicated patrern

        // Regular expressions can be used to perform all types of text search ad text
        // replace

        // Java does not have a built in regular expression class, but we can import the
        // java.util.regex
        // package to work with regular expresions.
        // The package includes the following classes
        // Pattern class - defines a pattern
        // Matcher class - used to search for the pattern
        // PatternSyntaxException class - indicates syntax error in a regular expression
        // pattern

        // example
        Pattern pattern = Pattern.compile("test", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("This is a test and TeSt!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found!");
        } else {
            System.out.println("Match not found!");
        }
        // For this example we passed the word test to be searched for in a sentence
        // First our pattern is create using pattern compile methid
        // the first parameter indicates which pattern is being searched for and second
        // parameter is a flag to indicate if our search is case sensitive

        // The matcher method us used to search for our pattern within a set string
        // the find executes the search and returns a boolean if found

        // Flags
        // Flags in compile() method change hwo the search is performed
        // here are some flags
        // Pattern.CASE_INSENSITIVE - The case of letters will be ignored when
        // performing a search
        // Pattern.Literal - special characters in the pattern will not have any special
        // meaning and will be treated as ordinary characters
        // Pattern.UNICODE_CASE - use it together with case insensitive to falg to ifnor
        // the case of letters outside the english alphabet

        // regular expression Patterns
        // The first parameter of the Pattern.compile method is the pattern. It describes what is being searched for
        // brackets are used to find a range of characters
        // ex:
        // [abc] - Find one character from the options between the brackets
        // [^abc] - Find one character not between the brackets
        // [0-9] - Find one character from the range of 0-9
    
        // Metacharacters
        // | - find a match for any one of the pattens seperated by | as in cat | dog | fish
        // . - Find just one instance of any character
        // ^ - Finds a match as the beginning of a string as in ^hello
        // $ - finds a match at the end of a string as in World
        // \d - find a digit
        // \s - find a whitespace character
        // \b - find a match at the beginning of a word like this \bWORD, or at the end of a word
        // \uxxxx - Find the unicode character specified by the hexadecimal number
    
        // Quantifiers 
        // Quantifiers define quantities
        // n+ - matches any string that contains at least one n
        // n* - matches any string that contains zero or more occurrences
        // n? - matches any string that contains zero or one occurrences of n
        // n{x} - matches any string that contains a sequence of X n's
        // n{x,y} - matches any string that contains a sequence of x to y in n's
        // n{x,} - matches any string that contains a sequence of at least X n's
    }

}
