import java.util.*;

class Solution {
    static int count1(int size, int arr[]) {
        //Write your code here
        int lo = 0;
        int hi = arr.length - 1;
        int lastIndex = -1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] == 1){
                lastIndex = mid;
                lo = mid + 1;
            } else{
                hi = mid - 1;
                
            }
        }
        return lastIndex == -1 ? 0 : lastIndex + 1;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.count1(n,array));
    }
}
