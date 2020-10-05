/*  LeetCode
*  1338. Reduce Array Size to The Half
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class ReduceArraySizeTOHalf {
    public static void main(String[] args) {
        int arr[]={3,3,3,3,5,5,5,2,2,7};

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for (int num : map.keySet()){
            q.add(map.get(num));
        }
        System.out.println(q);
        int len=arr.length;
        int count=0;
        while (len>arr.length/2) {
            count++;
            len -=q.poll();
        }
        System.out.println(q);
        System.out.println(count);
    }
    
}
