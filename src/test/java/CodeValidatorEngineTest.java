import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CodeValidatorEngineTest {

    @Test
    void validateListCode() {
        List<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(2);
        l.add(6);
        l.add(3);
        l.add(0);
        l.add(1);
        l.add(3);
        l.add(0);
        l.add(1);

        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(9);
        l2.add(8);
        l2.add(1);
        l2.add(5);
        l2.add(3);
        l2.add(0);
        l2.add(1);

        List<Integer> l3 = new ArrayList<>();
        l3.add(1);
        l3.add(2);
        l3.add(9);
        l3.add(8);
        l3.add(-1);
        l3.add(5);
        l3.add(3);
        l3.add(0);
        l3.add(1);

        List<List<Integer>> list = new ArrayList<>();
        list.add(l);
        list.add(l2);
        List<String> expectedList = new ArrayList<>();
        expectedList.add("526301301ERR");
        expectedList.add("129815301ERR");
        CodeValidatorEngine engine = new CodeValidatorEngine();
        // assertion with error
        Assertions.assertEquals(expectedList, engine.validateListCode(list));


    }
}