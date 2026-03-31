class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hp.containsKey(target-nums[i])){
                return new int[]{hp.get(target-nums[i]),i};
            }
            else{
                hp.put(nums[i],i);
            }
        }
        return new int[] {};
    }
}
