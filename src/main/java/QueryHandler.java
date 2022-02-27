import java.util.ArrayList;
import java.util.List;

public class QueryHandler {

    private Query query;
    private List<Integer> output = new ArrayList<>();

    public QueryHandler(Query query) {
        this.query = query;
    }

    private void createAndAddRepresentationToList(int[][] tab){
        NumberRepresentation nb = new NumberRepresentation(tab);
        RepresentationToNumberParser nbParse = new RepresentationToNumberParser(nb);
        output.add(nbParse.parserValue());
    }

    public void getNumberFromFile(String path){
        List<String> lines = query.readFile(path);
        int count = 0;
        for (int l = 0; l < lines.size();) {
            String lineOne = lines.get(l);
            String lineTwo = lines.get(l+1);
            String lineThree = lines.get(l+2);
            l= l+3;
            int[][] obj = new int[3][3];
            for(int i = 0; i < lineOne.length();){
                String subLineOne = lineOne.substring(i, i+3);
                String subLineTwo = lineTwo.substring(i, i+3);
                String subLineThree = lineThree.substring(i, i+3);
                for (int j = 0; j < 3; j++){
                    String c1 = String.valueOf(subLineOne.charAt(j));
                    String c2 = String.valueOf(subLineTwo.charAt(j));
                    String c3 = String.valueOf(subLineThree.charAt(j));
                    obj[0][j] = c1.equals(" ") ? 0 : 1;
                    obj[1][j] = c2.equals(" ") ? 0 : 1;
                    obj[2][j] = c3.equals(" ") ? 0 : 1;
                }
                createAndAddRepresentationToList(obj);
                i = i+3;
            }
        }
    }
}
