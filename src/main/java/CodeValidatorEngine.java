import java.util.ArrayList;
import java.util.List;

public class CodeValidatorEngine {

    private List<String> verifiedCode = new ArrayList<>();
    public CodeValidatorEngine() {
    }


    public List<String> validateListCode(List<List<Integer>> codes){
        for (List<Integer> code : codes) {
            int checkSum = code.get(0)*9 + code.get(1)*8 + code.get(2)*7 + code.get(3)*6 + code.get(4)*5 + code.get(5)*4 + code.get(6)*3 + code.get(7)*2 + code.get(8);
            StringBuilder codeToString = new StringBuilder();
            if (checkSum % 11 == 0){
                for (int c : code) {
                    codeToString.append(c);
                }
                verifiedCode.add(String.valueOf(codeToString));
            }
            else {
                for (int c : code) {
                    if (c != -1) {
                        codeToString.append(c);
                    } else {
                        codeToString.append("?");
                    }
                }
                for (int i = 0; i < codeToString.length(); i++){
                    String c = String.valueOf(codeToString.charAt(i));
                    if (c.equals("?")){
                        codeToString.append("ILL");
                        verifiedCode.add(String.valueOf(codeToString));
                        break;
                    }
                }
                if(codeToString.length() <= 10){
                    codeToString.append("ERR");
                    verifiedCode.add(String.valueOf(codeToString));
                }
            }
        }
        return verifiedCode;
    }
}
