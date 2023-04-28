package ReadCSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadFile {
    public Country splitString(String line) {
        String[] arrStr = line.split(",");
        int id = Integer.parseInt(arrStr[0]);
        String code = arrStr[1];
        String name = arrStr[2];
        return new Country(id, code, name);
    }

    public void readCSV(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            ArrayList<String> text = new ArrayList<String>();
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                text.add(line);
            }

            for (String element : text) {
                Country country = splitString(element);
                System.out.println(country.toString());
            }

            bufferedReader.close();
            reader.close();
        } catch (Exception exception) {
            System.err.println("File not exist");
        }
    }
}
