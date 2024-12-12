class Solution {
    public long pickGifts(int[] gifts, int k) {
        // Perform k operations
        for (int i = 0; i < k; i++) {
            // Find the maximum element and its index
            int maxIndex = 0;
            for (int j = 1; j < gifts.length; j++) {
                if (gifts[j] > gifts[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Update the maximum pile
            gifts[maxIndex] = (int) Math.floor(Math.sqrt(gifts[maxIndex]));
        }
        
        // Calculate the total gifts remaining
        long totalGifts = 0;
        for (int i = 0; i < gifts.length; i++) {
            totalGifts += gifts[i];
        }        
        return totalGifts;
    }
}
