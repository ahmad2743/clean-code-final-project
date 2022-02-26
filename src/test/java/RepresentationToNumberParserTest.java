import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepresentationToNumberParserTest {

    @Test
    void parserValue() {
        int[][] patternToOne = new int[3][3];
        patternToOne[1][2] = 1;
        patternToOne[2][2] = 1;
        NumberRepresentation oneValueTest = new NumberRepresentation(patternToOne);
        RepresentationToNumberParser rep = new RepresentationToNumberParser(oneValueTest);
        Assertions.assertEquals(1, rep.parserValue());
        // ----------------------------------------------------

        int[][] patternToTwo = new int[3][3];
        patternToTwo[0][1] = 1;
        patternToTwo[1][1] = 1;
        patternToTwo[1][2] = 1;
        patternToTwo[2][0] = 1;
        patternToTwo[2][1] = 1;
        NumberRepresentation twoValue = new NumberRepresentation(patternToTwo);
        RepresentationToNumberParser rep2 = new RepresentationToNumberParser(twoValue);
        Assertions.assertEquals(2, rep2.parserValue());


        //----------------------------------------------

        int[][] patternToNine = new int[3][3];
        patternToNine[0][0] = 1;

        NumberRepresentation nineValue = new NumberRepresentation(patternToNine);
        RepresentationToNumberParser repNine = new RepresentationToNumberParser(nineValue);
        Assertions.assertEquals(-1, repNine.parserValue());
    }
}