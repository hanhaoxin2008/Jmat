package org.jMatrix;

public class Matrix {
    //行数和列数
    private int rows;
    private int cols;
    //矩阵元素
    private double[][] data;

    //获取行数
    public int getRows() {
        return rows;
    }
    //获取列数
    public int getCols() {
        return cols;
    }
    //获取元素
    public double get(int row, int col) {
        return data[row][col];
    }
    //设置元素
    public void set(int row, int col, double val) {
        data[row][col] = val;
    }

    //构造函数
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new double[rows][cols];
    }
    //构造单位矩阵
    public static Matrix identity(int n) {
        /**
         * 构造单位矩阵
         * 单位矩阵是指对角线元素为1，其余元素为0的矩阵。
         * @param n 矩阵的维度
         * @return 单位矩阵
         */
        Matrix m = new Matrix(n, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    m.set(i, j, 1.0);
                }
                else {
                    m.set(i, j, 0.0);
                }
            }
        }
        return m;
    }

    @Override
    public String toString() {
        /**
         * 重写toString方法，以字符串形式返回矩阵元素。
         * @return 矩阵元素的字符串形式
         */
        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        //遍历矩阵元素，添加到StringBuilder中
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(data[i][j]).append(" ");
            }
            //换行
            sb.append("\n");
        }
        return sb.toString();
    }

    public static Matrix fromArray(double[][] arr) {
        /**
         * 从二维数组创建矩阵
         * 二维数组的行数为矩阵的行数，列数为矩阵的列数。
         * @param arr 二维数组
         * @return 二维数组对应的矩阵
         */

        //获取行数和列数
        int rows = arr.length;
        int cols = arr[0].length;
        //创建矩阵
        Matrix m = new Matrix(rows, cols);
        //填充矩阵元素
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m.set(i, j, arr[i][j]);
            }
        }
        return m;
    }


    public Matrix add(Matrix other) {
        /**
         * 矩阵相加
         * @param other 另一个矩阵
         * @return 两个矩阵相加的结果
         * @throws IllegalArgumentException 矩阵维度不匹配时抛出异常
         * 矩阵相加的规则：
         * 1. 两个矩阵的维度必须相同。
         * 2. 两个矩阵对应位置的元素相加。
         * 3. 结果矩阵的维度与两个矩阵相同。
         * 4. 返回结果矩阵。
          */

        //判断维度是否匹配
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Matrix dimensions do not match.");
        }
        //创建结果矩阵
        Matrix result = new Matrix(this.rows, this.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                //对应位置元素相加
                result.set(i, j, this.get(i, j) + other.get(i, j));
            }
        }
        return result;
    }



}
