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
        //正确输出：
        // [[10.0, 10.0, 10.0], [10.0, 10.0, 10.0], [10.0, 10.0, 10.0]]
    }
    @Test
    public void subTest(){
        Matrix matrix1 = Matrix.fromArray(new double[][]{{1,2,3},{4,5,6},{7,8,9}});
        Matrix matrix2 = Matrix.fromArray(new double[][]{{9,8,7},{6,5,4},{3,2,1}});
        Matrix result = matrix1.sub(matrix2);
        System.out.println(result.toString());
        //正确输出：
        // [[-8.0, -6.0, -4.0], [-2.0, 0.0, 2.0], [4.0, 6.0, 8.0]]
    }
    @Test
    public void mulTest(){
        Matrix matrix1 = Matrix.fromArray(new double[][]{{1,2,3},{4,5,6},{7,8,9}});
        Matrix matrix2 = Matrix.fromArray(new double[][]{{9,8,7},{6,5,4},{3,2,1}});
        Matrix result = matrix1.mul(matrix2);
        System.out.println(result.toString());
        //正确输出：
        // [[30.0, 24.0, 18.0], [84.0, 69.0, 54.0], [138.0, 114.0, 90.0]]
    }


}
