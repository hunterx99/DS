/* Date :- 14-10-2020
    Leetcode 
        59. Spiral Matrix II
*/
import java.util.Arrays;
public class SpiralMatrixII {
    public static void main(String[] args) {
        int n=3;
        int grid[][]=new int[n][n];
        if(n==0) System.out.println(grid);

        int row=0;
        int col=0;
        int collen=n-1;
        int rowlen=n-1;
        int num=1;
        while (row<=rowlen && col<=collen) {
            
            for (int i = col; i <= collen; i++) {
                grid[row][i]=num++;
            }
            row++;
            for (int i = row; i<=rowlen; i++) {
                grid[i][collen]=num++;
            }
            collen--;
            if (row<=rowlen) {
                for (int i = collen; i>=col; i--) {
                    grid[rowlen][i]=num++;
                }
            }
            rowlen--;
            if(col<=collen){
                for (int i = rowlen; i >=row; i--) {
                    grid[i][col]=num++;
                }
            }
            col++;
        }
        for (int[] is : grid) {
            System.out.println(Arrays.toString(is));
        }
    }
}
/* 
    [1, 2, 3]
    [8, 9, 4]
    [7, 6, 5]
*/