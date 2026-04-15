class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int leftmax=0,rightmax=0;
        for(int i=0;i<n;i++){
            left[i]=Math.max(height[i],leftmax);
            leftmax=Math.max(leftmax,height[i]);
            System.out.print("l " + left[i]);
        }
        for(int i=n-1;i>=0;i--){
            right[i]=Math.max(height[i],rightmax);
            rightmax=Math.max(rightmax,height[i]);
            System.out.print("r " + right[i]);
        }
        int res=0;
        for(int i=0;i<n;i++){
            res+=Math.min(left[i],right[i])-height[i];
        }
        return res;
    }
}
