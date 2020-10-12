/* 
    LeetCode
        1035. Uncrossed Lines
*/

import java.util.Arrays;

public class UncrossedLines {
    public static void main(String[] args) {
        int[] A={1,4,2};
        int[] B={1,2,4};

        int[][] dp=new int[A.length+1][B.length+1];
        
        for(int i=0;i<=A.length;i++){
            for(int j=0;j<=B.length;j++){
                if(i==0||j==0) 
                    dp[i][j]=0;
                else if(A[i-1] ==B[j-1]) 
                    dp[i][j]= 1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        for (int[] is : dp) {
            System.out.println(Arrays.toString(is));
        }
        System.out.println(dp[A.length][B.length]);
    }
    
}
/*  dp[][] 
        
        [0, 0, 0, 0]
        [0, 1, 1, 1] 1
        [0, 1, 1, 2] 4
        [0, 1, 2, 2] 2
            1  2  4
*/