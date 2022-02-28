import java.io.IOException;
import java.util.List;

public interface Command {
    void writeInOneFile(List<String> list, String filePath) throws IOException;
    void WriteInSeparatedFile(List<String> list, String filePath) throws IOException;
}
