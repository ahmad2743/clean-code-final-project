import java.io.*;
import java.util.List;

public class Main {
    public static void main(String ...args) throws IOException {
        String filePath = "/Users/ahmad/Downloads/cleanCodeFinalProject/src/main/java/test.txt";
        FileReaderQuery fileReader = new FileReaderQuery();
        QueryHandler handler = new QueryHandler(fileReader);
        handler.getNumberFromFile(filePath);
        List<Integer> result = handler.getOutput();
        System.out.println(result.toString());
    }

    /*public static void main(String ... args) throws IOException {
       FileReaderQuery fr = new FileReaderQuery();
       List<String> list = fr.readFile("/Users/ahmad/Downloads/cleanCodeFinalProject/src/main/java/test.txt");
        System.out.println(list.toString());
    }*/
}

