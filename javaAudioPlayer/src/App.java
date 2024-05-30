
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class App {
    public static void main(String[] args)
            throws Exception, UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);

        // to create a music player
        // we need to first create a file object
        File file = new File("Smoke - Lish Grooves.wav");

        // create a audio streaming variable as well which gets our audio streaming data
        // from our file
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

        // clip object will control our audio file
        // this opens and presets the duration of our audio as its reade the audiostream
        // when we call .open
        Clip clip = AudioSystem.getClip();

        clip.open(audioStream);

        // clip starts to play out music
        // before this functions we need to make our program loop and keep itself going
        // for the music to play
        clip.start();

        // we add this canner at the end to make sure our program continues to run
        // after we begin our clip
        // otherwise without our scanner our program would stop running after the clip
        // start method is called

        // so currently once the program starts it will keep playing music till the user
        // presses a key and pressed enter which lets the code terminate
        String response = scanner.next();
    }
}
