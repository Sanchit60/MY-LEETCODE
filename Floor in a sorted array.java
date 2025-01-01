
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner sc = new Scanner(System.in);
        // Input size of array and the value x
        int n = sc.nextInt();
        int x = sc.nextInt();

        // Input array
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find and print the floor index
        System.out.println(findFloor(arr, x));
    }
     
    public static int findFloor(int[] arr, int x){
        int lo = 0;
        int hi = arr.length - 1;
        int floorIndex = -1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] < x || arr[mid] == x){
                floorIndex = mid;
                lo = mid + 1;
            } else{
                hi = mid - 1;
            }
        }
        return floorIndex;
    }
}
