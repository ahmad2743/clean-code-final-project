import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWriterCommand implements Command{
    @Override
    public void writeInOneFile(List<String> list, String filePath) throws IOException {

        File outFile = new File(filePath);
        outFile.getParentFile().mkdirs();
        FileWriter fileWriter = new FileWriter(outFile, true);

        for (String str : list) {
            fileWriter.write(str);
            fileWriter.write("\n");
        }
        fileWriter.close();


    }

    @Override
    public void WriteInSeparatedFile(List<String> list, String storagePath) throws IOException {

        File outFileAuthorized = new File(storagePath+"Authorized");
        File outFileErrored = new File(storagePath+"Errored");
        File outFileUnknown = new File(storagePath+"Unknown");


        outFileAuthorized.getParentFile().mkdirs();
        outFileErrored.getParentFile().mkdirs();
        outFileUnknown.getParentFile().mkdirs();

        FileWriter fileWriterAuth = new FileWriter(outFileAuthorized, true);
        FileWriter fileWriterErr = new FileWriter(outFileErrored, true);
        FileWriter fileWriterUnknown = new FileWriter(outFileUnknown, true);


        for (String str : list) {
            if(str.length() == 9){
                fileWriterAuth.write(str);
                fileWriterAuth.write("\n");
            }
            else{
                String endWord = str.substring(9, 12);
                if (endWord.equals("ERR"))
                    fileWriterErr.write(str);
                else
                    fileWriterUnknown.write(str);
            }
        }
        fileWriterAuth.close();
        fileWriterErr.close();
        fileWriterUnknown.close();

    }
}

