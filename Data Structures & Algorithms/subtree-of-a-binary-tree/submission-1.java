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
    public boolean sameTree(TreeNode root, TreeNode subTree){
        if(root==null&&subTree==null){
            return true;
        }
        if((root==null&&subTree!=null)||root!=null&&subTree==null){
            return false;
        }
        if(root.val!=subTree.val){
            return false;
        }
        return sameTree(root.left,subTree.left)&&sameTree(root.right,subTree.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        boolean res=false;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode x=q.poll();
            if(x.val==subRoot.val){
                res=sameTree(x,subRoot);
                System.out.println(res);
                if(res==true){
                    return true;
                }
            }
            if(x.left!=null){
                q.add(x.left);
            }
            if(x.right!=null){
                q.add(x.right);
            }
        }
        return res;
    }
}
