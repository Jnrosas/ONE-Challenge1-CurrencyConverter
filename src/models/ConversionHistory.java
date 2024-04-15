package models;

import java.io.FileWriter;
import java.io.IOException;

public class ConversionHistory {

    public void saveConversions(String conversion) throws IOException {
        FileWriter savedConversion = new FileWriter("history.txt", true);
        savedConversion.write(String.valueOf(conversion));
        savedConversion.close();
    }
}
