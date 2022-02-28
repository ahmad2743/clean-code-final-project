import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface Query {
    List<String> readFile(String path) throws IOException;
}
