/* Date :- 14-10-2020
    Leetcode 
        1329. Sort the Matrix Diagonally

*/
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortMatrixDiagonally {
    public static void main(String[] args) {
        int arr[][]={{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        int m=arr.length,n=arr[0].length;
        
        //PriorityQueue to sort element
        HashMap<Integer,PriorityQueue<Integer>> map=new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                map.putIfAbsent(i-j,new PriorityQueue<>());
                map.get(i-j).add(arr[i][j]);
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=map.get(i-j).poll();
            }
        }
        System.out.println("Sorted :");
        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
    }
}
/* 
     Unsortd:            Sorted :
      [3, 3, 1, 1]         [1, 1, 1, 1]
      [2, 2, 1, 2]         [1, 2, 2, 2]
      [1, 1, 1, 2]         [1, 2, 3, 3]
*/