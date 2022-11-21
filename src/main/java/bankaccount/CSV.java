package bankaccount;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    public static List<String[]> read(String file) {
        List<String[]> data = new LinkedList<>();
        String line;
        try {
            BufferedReader bfr = new BufferedReader(new FileReader(file));
            while ( (line = bfr.readLine())!=null) {
                String[] datarecord = line.split(",");
                data.add(datarecord);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
return data;
    }
}

