import java.util.Arrays;

public class twoDimenisonalArray {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int total = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j)
                    matrix[i][j] = i;
                else matrix[i][j] = 0;
                if (i==j)
                    total += matrix[i][j];


            System.out.println(Arrays.deepToString(matrix));

            }
            System.out.println(total);
        }

    }
}


