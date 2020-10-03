/* Leetcode
1277. Count Square Submatrices with All Ones */

public class CountSquareSubmatricesWithAllOnes{
    public static void main(String[] args) {
        int matrix[][] ={{0,1,1,1},{1,1,1,1},{0,1,1,1}};

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i>0 && j>0 && matrix[i][j]>0)
                  matrix[i][j] =Math.min(matrix[i - 1][j - 1], Math.min(matrix[i - 1][j], matrix[i][j - 1])) + 1;
            }
        }
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                count +=matrix[i][j];
            }
        }
        System.out.println(count);
       
       
        /*  for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        } */
    }
}
