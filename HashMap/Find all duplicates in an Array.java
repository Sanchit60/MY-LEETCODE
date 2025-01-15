class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> duplicates = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) > 1 || map.get(nums[i]) == 2){
                duplicates.add(nums[i]);
            }
        }
        
        Collections.sort(duplicates);

        return duplicates;       
        
    }
}
