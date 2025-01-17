// Approach - 1
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnes = -1;
        int max_row_idx = -1;
        for(int i = 0; i < mat.length; i++){
            int oneCount = 0;
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    oneCount++;
                }
            }
            if(oneCount > maxOnes || (oneCount == maxOnes) && i < max_row_idx){
                maxOnes = oneCount;
                max_row_idx = i;

            }
        }
        return new int[] {max_row_idx, maxOnes};

    }
}
//Approach-2

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Solution s = new Solution();
        System.out.println(s.rowWithMaximumOnes(arr,n,m));
        
    }
}

class Solution {
    static int rowWithMaximumOnes(int arr[][], int n, int m) {
        int max_ones = -1;
        int max_row_idx = -1;

        for (int i = 0; i < n; i++) {
            int oneCount = 0; 
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    oneCount++;
                }
            }

            if (oneCount > max_ones || (oneCount == max_ones && i < max_row_idx)) {
                max_ones = oneCount;
                max_row_idx = i;
            }
        }

        return max_row_idx;
     
    }
}
