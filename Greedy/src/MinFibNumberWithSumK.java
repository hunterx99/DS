import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* LeetCode
    1414. Find the Minimum Number of Fibonacci Numbers Whose Sum Is K
    
*/
public class MinFibNumberWithSumK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        List<Integer> fb=new ArrayList<>();
        int s=1,f=1;
        fb.add(1);
        fb.add(1);
        while(true){
            if(s+f>k) break;
            fb.add(s+f);
            s +=f;
            f=fb.get(fb.size()-2);
        }
        //System.out.println(fb);
        int count=0;
        for(int i=fb.size()-1;i>=0;i--){
            if(fb.get(i)<=k){
                count++;
                k -=fb.get(i);
            }
            if(k==0) break;
        }

        System.out.println(count);
        sc.close();
    }
}
