import java.util.List;

public interface Command {
    void writeInOneFile(List<String> list);
    void WriteInSeparatedFile(List<String> list);
}
