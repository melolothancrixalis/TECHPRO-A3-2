import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;

        String filePath = "Rise and Shine.wav";
        while (alarmTime == null) {
            try {
                System.out.print("Enter alarm time (HH:MM:SS): ");
                String input = scanner.nextLine();
                alarmTime = LocalTime.parse(input, formatter);

                System.out.println("Alarm set for " + alarmTime);

            } catch (DateTimeParseException e) {
                System.out.println("Invalid format! Use HH:MM:SS");
            }
        }

        System.out.println("Waiting for alarm...");

        while (true) {

            LocalTime now = LocalTime.now();

            System.out.printf("\r%02d:%02d:%02d",
                    now.getHour(),
                    now.getMinute(),
                    now.getSecond());

            if (now.getHour() == alarmTime.getHour()
                    && now.getMinute() == alarmTime.getMinute()
                    && now.getSecond() == alarmTime.getSecond()) {
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }

        System.out.println("\nALARM!");

        try {
            File audioFile = new File(filePath);

            if (!audioFile.exists()) {
                System.out.println("Audio file not found!");
                return;
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();

            System.out.println("Press ENTER to stop alarm...");
            scanner.nextLine();

            clip.stop();
            clip.close();
            audioStream.close();

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio format.");
        } catch (LineUnavailableException e) {
            System.out.println("Audio unavailable.");
        } catch (IOException e) {
            System.out.println("Error reading audio file.");
        }

        scanner.close();
        System.out.println("Alarm stopped.");
    }
}