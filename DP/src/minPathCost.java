/* Date : 13-10-20
    LeetCode
        64. Minimum Path Sum
    
*/
public class minPathCost {
    public static void main(String[] args) {
        int grid[][]={{1,3,1},{1,5,1},{4,2,1}};

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0 && j==0) continue;
                else if(i==0) grid[i][j] += grid[0][j-1];
                else if(j==0) grid[i][j] += grid[i-1][0];
                else{
                    grid[i][j] +=Math.min(grid[i][j-1],grid[i-1][j]);
                }
            }
        }
            System.out.println(grid[grid.length-1][grid[0].length-1]);
        
            /* for (int[] is : grid) {
            System.out.println(Arrays.toString(is));            
        } */

    }
}
/* 
    [1, 4, 5]
    [2, 7, 6]
    [6, 8, 7]
*/