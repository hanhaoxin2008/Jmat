import org.junit.jupiter.api.Test;
import org.jMatrix.Matrix;
public class TestMatrix
{
    @Test
    public void toStringTest(){
        Matrix matrix = Matrix.identity(3);
        System.out.println(matrix.toString());
    }
    @Test
    public void arrayTomatrixTest(){
        double[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        Matrix matrix = Matrix.fromArray(array);
        System.out.println(matrix.toString());
    }
    @Test
    public void addTest(){
        Matrix matrix1 = Matrix.fromArray(new double[][]{{1,2,3},{4,5,6},{7,8,9}});
        Matrix matrix2 = Matrix.fromArray(new double[][]{{9,8,7},{6,5,4},{3,2,1}});
        Matrix result = matrix1.add(matrix2);
        System.out.println(result.toString());
    }

}
