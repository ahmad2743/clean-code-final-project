import java.io.*;
import java.util.List;

public class FileReaderQuery implements Query {
    @Override
    public List<String> readFile(String path) {
        List<String> lineList = null;
        File file = new File(path);

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String line;
        while (true) {
            try {
                line = reader.readLine();
                if(line != null){
                    lineList.add(line);
                }
                else{
                    return lineList;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}