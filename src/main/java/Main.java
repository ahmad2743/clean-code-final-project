import java.io.*;
import java.util.ArrayList;
import java.util.List;
/*
* args (option) flags: -r: readFile input position 0
* filePath:  file input path position 1
* args (option) flags -o: specified output file or path position 2
* output filePath : position 3
* args (option) flags -m: for three files output or -s: for single file output position 4
*
*
*
*
* */

public class Main {
    public static void main(String ...args) throws IOException {
        if (args.length > 1){
            if(args[0].equals("-r")){
                String filePath = args[1];
                FileReaderQuery fileReader = new FileReaderQuery();
                QueryHandler handler = new QueryHandler(fileReader);
                handler.getNumberFromFile(filePath);
                List<List<Integer>> result = handler.getOutput();
                CodeValidatorEngine engine = new CodeValidatorEngine();
                FileWriterCommand writer = new FileWriterCommand();
                List<String> validatedCodes = engine.validateListCode(result);
                if (args[2].equals("-o")){
                    String output = args[3];
                    String outputMode = args[4];
                    switch (outputMode){
                        case "-s": writer.writeInOneFile(validatedCodes, output);
                            System.out.println("file successfully created in "+output);
                            break;
                        case "-m": writer.WriteInSeparatedFile(validatedCodes, output);
                            System.out.println("files successfully created in "+output);
                            break;
                        default: return;
                    }
                }
                else
                    throw new IllegalArgumentException();
            }
            else
                throw new IllegalArgumentException();
        }
        else
            throw new IllegalArgumentException();

    }
}
