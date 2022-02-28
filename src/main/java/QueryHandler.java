import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

    public List<Integer> getOutput() {
        return output;
    }

    public void getNumberFromFile(String path) throws IOException {
        List<String> lines = query.readFile(path);
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
                    obj[0][j] = (c1.equals("_") || c1.equals("|")) ? 1 : 0;
                    obj[1][j] = (c2.equals("_") || c2.equals("|")) ? 1 : 0;
                    obj[2][j] = (c3.equals("_") || c3.equals("|")) ? 1 : 0;
                }
                createAndAddRepresentationToList(obj);
                System.out.println("["+obj[0][0]+","+obj[0][1]+","+obj[0][2]);
                System.out.println(" "+obj[1][0]+","+obj[1][1]+","+obj[1][2]);
                System.out.println(" "+obj[2][0]+","+obj[2][1]+","+obj[2][2]+"] \n");
                i = i+3;
            }
        }
    }
}
