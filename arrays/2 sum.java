class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> Map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
                 int x = target-nums[i];
            if(Map.containsKey(x)){
                return new int[]{Map.get(x),i};
            }
                else {
                Map.put(nums[i],i);
                }
                    
            }
        return new int[]{-1 , -1 };
        
    }
}
//solution using hashmap for 2sum problem.