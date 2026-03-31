class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer>hp=new HashMap<>(nums.length);
        for(int i=0;i<nums.length;i++){
            if(hp.containsKey(nums[i])){
                return true;
            }
            else{
                hp.put(nums[i],1);
            }
        }
        return false;
    }
}