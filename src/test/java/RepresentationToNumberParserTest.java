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

        //--------------------------------------------------

        int[][] patternToSeven = new int[3][3];
        patternToSeven[0][1] = 1;
        patternToSeven[1][2] = 1;
        patternToSeven[2][2] = 1;
        NumberRepresentation sevenValue = new NumberRepresentation(patternToSeven);
        RepresentationToNumberParser rep7 = new RepresentationToNumberParser(sevenValue);
        Assertions.assertEquals(7, rep7.parserValue());

        //----------------------------------------------------

        int[][] patternToNine = new int[3][3];
        patternToNine[0][1] = 1;
        patternToNine[1][0] = 1;
        patternToNine[1][1] = 1;
        patternToNine[1][2] = 1;
        patternToNine[2][1] = 1;
        patternToNine[2][2] = 1;
        NumberRepresentation nineValue = new NumberRepresentation(patternToNine);
        RepresentationToNumberParser rep9 = new RepresentationToNumberParser(nineValue);
        Assertions.assertEquals(9, rep9.parserValue());

        //--------------------------------------------
        int[][] notValue = new int[3][3];
        NumberRepresentation notValueTest = new NumberRepresentation(notValue);
        RepresentationToNumberParser nullTest = new RepresentationToNumberParser(notValueTest);
        Assertions.assertEquals(-1, nullTest.parserValue());


    }
}