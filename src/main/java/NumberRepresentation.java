import javax.naming.directory.InvalidAttributesException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;

public class NumberRepresentation {

    private int[][] myMatrix;
    private int value;
    NumberRepresentation(int[][] matrix){
        if (matrix.length == 3)
            this.myMatrix = matrix;
        else
            throw new InvalidParameterException();

    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberRepresentation that = (NumberRepresentation) o;
        for (int i = 0; i < myMatrix.length; i++){
            for (int j = 0; j < myMatrix.length; j++){
                if ((myMatrix[i][j] == 1) && (that.myMatrix[i][j] != 1)){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(myMatrix);
    }

}