import java.io.*;
import java.util.*;

public class Reminder {
    public static void main(String[] args) {
        List<String> reminders = new ArrayList<>();

        // Try reading the file
        try {
            File file = new File("reminders.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (!line.isEmpty()) {
                    reminders.add(line);
                }
            }

            scanner.close();

            if (reminders.isEmpty()) {
                System.out.println("No reminders found in the file.");
            } else {
                Random rand = new Random();
                String randomReminder = reminders.get(rand.nextInt(reminders.size()));
                System.out.println("Today's Reminder:\n" + randomReminder);
            }

        } catch (FileNotFoundException e) {
            System.out.println("reminders.txt not found. Make sure it's in the same folder.");
        }
    }
}
