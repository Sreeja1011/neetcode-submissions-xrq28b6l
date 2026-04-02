class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCnt=0;
        for(int x:nums){
            if(x==0){
                zeroCnt++;
            }
        }
        int res[]=new int[nums.length];
        if(zeroCnt>1){
            Arrays.fill(res,0);
                return res;
            }
        
        int product=1;
        for(int x:nums){
            if(x!=0){
                product=product*x;
            }
        }
        int iter=0;
        for(int x:nums){
            if(x==0){
                res[iter]=product;
            }
            else{
                if(zeroCnt>0){
                    res[iter]=0;
                }
                else{
            res[iter]=product/x;
                }
            }
            iter++;
        }
        return res;
    }
}  
