import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

// in app2 we are going top add to out code so we can create a music player that lets the user 
// stop and play the music when they want
// and terminate the program when they choose

public class App2 {
    public static void main(String[] args)
            throws Exception, UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);

        File file = new File("Smoke - Lish Grooves.wav");

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

        Clip clip = AudioSystem.getClip();

        clip.open(audioStream);

        // set our response to an empty string
        String response = "";

        // while our response is empty run the code from within
        while (!response.equals("Q")) {
            // tell our user the controls
            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            // let them know to input their selection
            System.out.println("Enter your choice");

            // open a scanner
            response = scanner.next();
            // change our input to uppercase
            // this way we can catch both lower case and upper case q
            response = response.toUpperCase();

            // check the input
            switch (response) {
                case "P":
                    // P will start the audio player
                    clip.start();
                    break;
                case "S":
                    // S will stop the audio player
                    clip.stop();
                    break;
                case "R":
                    // R will reset by resetting the position marked in milliseconds
                    clip.setMicrosecondPosition(0);
                    break;
                case "Q":
                    // Q will close the audio player
                    clip.close();
                    break;
                default:
                    // then we will print our invalid if the user inputs anything else and start the
                    // loop again
                    System.out.println("Not a valid input!");
            }
            // on Q exit this loop as well
        }
        System.out.println("Bye");
        // close our scanner
        scanner.close();
    }
}
