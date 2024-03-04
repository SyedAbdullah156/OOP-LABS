package Task_3;

public class Matrix 
{
    private int rows;
    private int cols;
    private double[][] matrix;

    public Matrix(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new double[rows][cols];  
    }
    public Matrix(int rows)
    {
        this(rows, rows);
    }

    public double determinant (double[][] matrix)
    {
        int n = matrix.length;
        double det = 0.0;
        if(n == 1)
        {
            return matrix[0][0];
        }
        if(n == 2)
        {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        for(int col = 0; col < n; col++)
        {
            det += (col % 2 == 0 ? 1 : -1) * matrix[0][col] * determinant(getMinor(matrix, 0, col));
        }
        return det;
    }
    private double[][] getMinor(double[][] matrix, int rowToRemove, int colToRemove)
    {
        int n = matrix.length;
        double[][] minor = new double[n - 1][n - 1];
        for(int matrixRow = 0, minorRow = 0; matrixRow < n; matrixRow++)
        {
            if(matrixRow == rowToRemove)
            {
                continue;
            }
            for(int matrixCol = 0, minorCol = 0; matrixCol < n; matrixCol++)
            {
                if(matrixCol == colToRemove)
                {
                    continue;
                }
                minor[minorRow][minorCol] = matrix[matrixRow][matrixCol];
                minorCol++;
            }
            minorRow++;
        }
        return minor;
    }
    public double[][] transpose(double[][] matrix)
    {
        double[][] transposedMatrix = new double[rows][cols];
        for(int row = 0; row < rows; row++)
        {
            for(int col = 0; col < cols; col++)
            {
                transposedMatrix[row][col] = matrix[col][row];
            }
        }
        return transposedMatrix;
    }
    public double[][] inverse(double[][] matrix)
    {
        double[][] inverse = new double[rows][cols];
        double det =  determinant(matrix);
        if(det == 0)
        {
            throw new IllegalArgumentException("No inverse when det is 0.");
        }
        for(int row = 0; row < rows; row++)
        {
            for(int col = 0; col < cols; col++)
            {
                inverse[col][row] = ((row + col) % 2 == 0 ? 1 : -1) * determinant(getMinor(matrix, row, col)) / det;
            }
        }
        return inverse;
    }
}
