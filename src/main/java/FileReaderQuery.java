import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReaderQuery implements Query {
    List<String> lineList = new ArrayList<>();
    public FileReaderQuery() {
    }

    @Override
    public List<String> readFile(String path) throws IOException {

        Reader reader = new FileReader(path);

        // Create a BufferedReader with buffer array size of 16384 (32786 bytes = 32 KB).
        BufferedReader br = new BufferedReader(reader, 16384);

        String line = null;

        while((line = br.readLine())!= null) {
            System.out.println(line.length());
            if(line.length() != 0){
                lineList.add(line);
            }

        }
        br.close();
        return lineList;
    }

}
