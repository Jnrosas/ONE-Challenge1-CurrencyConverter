package models;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConversionHistory {

    public void saveConversions(String conversion) throws IOException {

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.
                ofPattern("      EEEE, dd MMMM yyyy - HH:mm:ss      ");
        String text = dateTime.format(formatter);

        FileWriter savedConversion = new FileWriter("history.txt", true);
        savedConversion.write(text);
        savedConversion.write(String.valueOf(conversion));
        savedConversion.write("\n\n");
        savedConversion.close();
    }
}
