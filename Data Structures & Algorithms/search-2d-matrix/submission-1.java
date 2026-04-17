class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bot = matrix.length-1;
        int rows=matrix.length;
        int cols=matrix[0].length;
        while(top<=bot){
            int mid=(bot+top)/2;
            if(target>matrix[mid][cols-1]){
                top=mid+1;
            }
            else if(target<matrix[mid][0]){
                bot=mid-1;
            }
            else{
                break;
            }
        }
        if(!(top<=bot)){
            return false;
        }
        int mid=(top+bot)/2;
        int l=0,r=cols-1;
        while(l<=r){
            int m=(l+r)/2;
            if(target>matrix[mid][m]){
                l=m+1;
            }
            else if(target<matrix[mid][m]){
                r=m-1;
            }
            else{
                return true;
            }
        }
        return false; 
    }
}
