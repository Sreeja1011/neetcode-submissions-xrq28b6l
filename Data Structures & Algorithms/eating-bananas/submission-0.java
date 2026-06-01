class Solution {
    public int calculateHours(int []piles,int rate){
        int res=0;
        for(int x:piles){
            if(x<=rate){
                res+=1;
            }
            else if(x%rate==0){
                res=res+(x/rate);
            }
            else{
                res+=(x/rate)+1;
            }
        }
        System.out.println(res+" rate"+ rate+" ");
        return res;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int x:piles){
            max=Math.max(x,max);
        }
        int low=1;
        int high=max;
        int minHours=0,mid=0;
        int bestH=0;

        while(low<=high){
            mid=low+(high-low)/2;
            minHours=calculateHours(piles,mid);
            if(minHours<=h){
                bestH=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
    return bestH;
    }
}
