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
    public int res=1;
    public void nodes(TreeNode x,int maxNode){
        if(x==null){
            return ;
        }
        if(x.val>=maxNode){
            res++;
            maxNode=x.val;
        }
        nodes(x.left,maxNode);
        nodes(x.right,maxNode);

    }
    public int goodNodes(TreeNode root) {
        nodes(root.left,root.val);
        nodes(root.right,root.val);
        return res;
    }
}
