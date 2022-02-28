import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeValidor {
    List<Integer> codeList = new ArrayList<>();
    List<Integer> validCode = new ArrayList<>();
    List<Integer> Wrongcode = new ArrayList<>();


    public CodeValidor(List<Integer> codeList) {
        this.codeList = codeList;
    }
    public List<Integer> getValidCode() {
        return validCode;
    }

    public List<Integer> getWrongcode() {
        return Wrongcode;
    }

    public boolean isCodeValid(List<Integer> code){
        return true;
    }

}
