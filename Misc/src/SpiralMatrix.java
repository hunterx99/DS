/*  Date :- 14-10-2020
    Leetcode 
        54. Spiral Matrix
*/
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        int grid[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row=0;
        int col=0;
        int collen=grid[0].length-1;
        int rowlen=grid.length-1;
        while (row<=rowlen && col<=collen) {
            
            for (int i = col; i <= collen; i++) {
                list.add(grid[row][i]);
            }
            row++;
            for (int i = row; i<=rowlen; i++) {
                list.add(grid[i][collen]);
            }
            collen--;
            if (row<=rowlen) {
                for (int i = collen; i>=col; i--) {
                    list.add(grid[rowlen][i]);
                }
            }
            rowlen--;
            if(col<=collen){
                for (int i = rowlen; i >=row; i--) {
                    list.add(grid[i][col]);
                }
            }
            col++;
        }
        System.out.println(list);
    }
}
