import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // this module will generate HTML files for webpages

        // 1. ask user for a file name
        // 2. check if file exits
        // 3. determine if file is empty
        // 4. rename .txt as .html
        // 5. read each line and insert necessary <tags>

        Scanner scanner = new Scanner(System.in);

        Scanner fileIn;// input file connection

        PrintWriter fileOut;// HTML file connection

        String fileNameIn; // original file name;

        String fileNameOut; // new html file'es name

        int dotIndex; // poistion of . in filename

        String line = null; // a line from the input file

        // ask user for a file name (or file path)
        System.out.println("Enter file name or path");

        // ask for the user to ender a file name
        fileNameIn = scanner.nextLine();

        // check if file exists
        try {
            // create a new scanner that checks to see if the file exists
            fileIn = new Scanner(new FileReader(fileNameIn));
            // find dots in file name which should return the dot that specifies file type
            dotIndex = fileNameIn.lastIndexOf(".");

            // if no file extension is found
            if (dotIndex == -1) {
                // then we create the html with the name the user input
                fileNameOut = fileNameIn + ".html";
            } else {
                // otherwise if the file exists convert it to a html
                fileNameOut = fileNameIn.substring(0, dotIndex) + ".html";
            }

            fileOut = new PrintWriter(fileNameOut);

            // determine if the file is empty
            try {
                line = fileIn.nextLine();
            } catch (NoSuchElementException e) {
                System.out.println("Error: " + e.getMessage());
            }

            if (line == null) {
                System.out.println("This file is empty!");
            } else {
                fileOut.println("<html>");
                fileOut.println("<head>");
                fileOut.println("</head>");
                fileOut.println("<body>");
                fileOut.println(line);

                while (fileIn.hasNextLine()) {
                    fileOut.println("<br>");
                    line = fileIn.nextLine();

                    if (line.isEmpty()) {
                        fileOut.println("<br>");
                    } else {
                        fileOut.println(line);
                    }

                }

                fileOut.println("</body>");
                fileOut.println("</html>");

                System.out.println("HTML file is processed");

            }
            fileIn.close();
            fileOut.close();
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("File not found!");
        }

    }
}
