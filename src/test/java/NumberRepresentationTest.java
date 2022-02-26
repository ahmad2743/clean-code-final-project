import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberRepresentationTest {

    @Test
    void getValue() {
    }

    @Test
    void setValue() {
    }

    @Test
    void testEquals() {
        int [][] matrix1 = new int[3][3];
        matrix1[1][0] = 1;
        matrix1[1][1] = 1;
        matrix1[0][0] = 1;
        matrix1[1][2] = 1;
        NumberRepresentation mat1 = new NumberRepresentation(matrix1);
        int [][] matrix2 = new int[3][3];
        matrix2[1][0] = 1;
        matrix2[1][1] = 1;
        matrix2[0][0] = 1;
        matrix2[1][2] = 1;
        NumberRepresentation mat2 = new NumberRepresentation(matrix2);
        int [][] matrix3 = new int[3][3];
        matrix3[1][0] = 0;
        matrix3[1][1] = 1;
        matrix3[0][0] = 1;
        matrix3[1][2] = 1;
        NumberRepresentation mat3 = new NumberRepresentation(matrix3);


        Assertions.assertEquals(true, mat1.equals(mat2));
        Assertions.assertEquals(false, mat1.equals(mat3));
    }


}
