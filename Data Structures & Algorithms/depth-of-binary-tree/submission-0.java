/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int depth(TreeNode root,int d){
        if(root==null){
            return d-1;
        }
        int left= depth(root.left,d+1);
        System.out.println("left depth "+left);
        int right=depth(root.right,d+1);
        System.out.println("right depth"+right);
        return Math.max(left,right);
    }
    public int maxDepth(TreeNode root) {
         int res= depth(root,1);
        return res;
    }
}
