/* Date : 13-10-20
    LeetCode
        62. Unique Paths

*/

//import java.util.Arrays;
import java.util.Scanner;

public class uniquePath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] dp =new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || j==0) dp[i][j]=1;
                else{
                    dp[i][j]=dp[i][j-1] + dp[i-1][j];
                }
            }
        }
       /*  for (int[] is : dp) {
            System.out.println(Arrays.toString(is));
        } */
        System.out.println(dp[m-1][n-1]);
        sc.close();
    }
}

/* 
    m=3 n=7
    
    [1, 1, 1, 1, 1, 1, 1]
    [1, 2, 3, 4, 5, 6, 7]
    [1, 3, 6, 10, 15, 21, 28]

*/
