import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyWriter {
    public List<String> readFile(String filePath) {
        List<String> text = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader((new FileReader(file)));
            String line = "";
            while ((line = br.readLine()) != null) {
                text.add(line);
            }
            br.close();
        } catch (Exception exception) {
            System.err.println("File not exist");;
        }
        return text;
    }

    public void writeFile(String filePath, List<String> text) {
        try {
            File file = new File(filePath);

            if (file.exists()) {
                System.out.println("File already existed");
            } else {
                file.createNewFile();
            }

            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (String line : text) {
                bufferedWriter.write(line + "\n");
            }
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String sourceFile = "src/TextFiles/source.txt";
        String desFile = "src/TextFiles/des.txt";
        CopyWriter copyWriter = new CopyWriter();

        List<String> text = copyWriter.readFile(sourceFile);
        copyWriter.writeFile(desFile, text);
    }
}
