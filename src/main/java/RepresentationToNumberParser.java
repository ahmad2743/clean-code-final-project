import java.util.List;

public class RepresentationToNumberParser {
    private NumberRepresentation representation;
    private List<NumberRepresentation> NumberRepresentationList;

    public RepresentationToNumberParser(NumberRepresentation representation) {
        this.representation = representation;
        this.patternInitialization();
    }

    public int parserValue(){
        for (NumberRepresentation elt : NumberRepresentationList) {
            if (elt.equals(this.representation)){
                return elt.getValue();
            }
        }
        return -1; // don't match any value
    }

    private void patternInitialization(){
        int[][] patternToOne = new int[3][3];
        patternToOne[1][2] = 1;
        patternToOne[2][2] = 1;
        NumberRepresentation oneValue = new NumberRepresentation(patternToOne);
        oneValue.setValue(1);
        NumberRepresentationList.add(oneValue);
        int[][] patternToTwo = new int[3][3];
        patternToTwo[0][1] = 1;
        patternToTwo[1][1] = 1;
        patternToTwo[0][2] = 1;
        patternToTwo[2][0] = 1;
        patternToTwo[2][0] = 1;
        NumberRepresentation twoValue = new NumberRepresentation(patternToOne);
        twoValue.setValue(2);
        NumberRepresentationList.add(twoValue);
        int[][] patternToTree = new int[3][3];
        patternToTree[0][1] = 1;
        patternToTree[1][1] = 1;
        patternToTree[1][2] = 1;
        patternToTree[2][1] = 1;
        patternToTree[2][2] = 1;
        NumberRepresentation treeValue = new NumberRepresentation(patternToOne);
        treeValue.setValue(3);
        NumberRepresentationList.add(treeValue);
        int[][] patternToFour = new int[3][3];
        patternToFour[1][0] = 1;
        patternToFour[1][1] = 1;
        patternToFour[1][2] = 1;
        patternToFour[2][2] = 1;
        NumberRepresentation fourValue = new NumberRepresentation(patternToOne);
        fourValue.setValue(4);
        NumberRepresentationList.add(fourValue);
        int[][] patternToFive = new int[3][3];
        patternToFive[0][1] = 1;
        patternToFive[1][0] = 1;
        patternToFive[1][1] = 1;
        patternToFive[2][1] = 1;
        patternToFive[1][1] = 1;
        NumberRepresentation fiveValue = new NumberRepresentation(patternToOne);
        fiveValue.setValue(5);
        NumberRepresentationList.add(fiveValue);
        int[][] patternToSix = new int[3][3];
        patternToSix[0][1] = 1;
        patternToSix[1][0] = 1;
        patternToSix[1][1] = 1;
        patternToSix[2][0] = 1;
        patternToSix[2][1] = 1;
        patternToSix[2][2] = 1;
        NumberRepresentation sixValue = new NumberRepresentation(patternToOne);
        sixValue.setValue(6);
        NumberRepresentationList.add(sixValue);
        int[][] patternToSeven = new int[3][3];
        patternToSeven[0][1] = 1;
        patternToSeven[1][2] = 1;
        patternToSeven[2][2] = 1;
        NumberRepresentation sevenValue = new NumberRepresentation(patternToOne);
        sevenValue.setValue(7);
        NumberRepresentationList.add(sevenValue);
        int[][] patternToEight = new int[3][3];
        patternToEight[0][1] = 1;
        patternToEight[1][0] = 1;
        patternToEight[1][1] = 1;
        patternToEight[1][2] = 1;
        patternToEight[2][0] = 1;
        patternToEight[2][1] = 1;
        patternToEight[2][2] = 1;
        NumberRepresentation eightValue = new NumberRepresentation(patternToOne);
        eightValue.setValue(8);
        NumberRepresentationList.add(eightValue);
        int[][] patternToNine = new int[3][3];
        patternToNine[0][1] = 1;
        patternToNine[1][0] = 1;
        patternToNine[1][1] = 1;
        patternToNine[1][2] = 1;
        patternToNine[2][1] = 1;
        patternToNine[2][2] = 1;
        NumberRepresentation nineValue = new NumberRepresentation(patternToOne);
        nineValue.setValue(9);
        NumberRepresentationList.add(nineValue);
        int[][] patternToZero = new int[3][3];
        patternToZero[0][1] = 1;
        patternToZero[1][1] = 1;
        patternToZero[1][3] = 1;
        patternToZero[2][0] = 1;
        patternToZero[2][1] = 1;
        patternToZero[2][2] = 1;
        NumberRepresentation zeroValue = new NumberRepresentation(patternToOne);
        zeroValue.setValue(0);
        NumberRepresentationList.add(zeroValue);
    }
}
