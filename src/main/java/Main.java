import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /*public static void main(String ...args) throws IOException {
        String filePath = "/Users/ahmad/Downloads/cleanCodeFinalProject/src/main/java/test.txt";
        FileReaderQuery fileReader = new FileReaderQuery();
        QueryHandler handler = new QueryHandler(fileReader);
        handler.getNumberFromFile(filePath);
        List<List<Integer>> result = handler.getOutput();
        System.out.println(result.toString());
    }*/

    /*public static void main(String ... args) throws IOException {
       FileReaderQuery fr = new FileReaderQuery();
       List<String> list = fr.readFile("/Users/ahmad/Downloads/cleanCodeFinalProject/src/main/java/test.txt");
        System.out.println(list.toString());
    }*/

    public static void main(String ...args){
        List<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(2);
        l.add(6);
        l.add(3);
        l.add(0);
        l.add(1);
        l.add(3);
        l.add(0);
        l.add(1);

        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(9);
        l2.add(8);
        l2.add(-1);
        l2.add(5);
        l2.add(3);
        l2.add(0);
        l2.add(1);

        List<List<Integer>> list = new ArrayList<>();
        list.add(l);
        list.add(l2);

        CodeValidatorEngine engine = new CodeValidatorEngine();
        System.out.println(engine.validateListCode(list));
    }
}

