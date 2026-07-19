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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        //res.add(root.val);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>r=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode x=q.poll();
                r.add(x.val);
                System.out.println(x.val);
                if(x.left!=null){
                q.add(x.left);
               
                }
                if(x.right!=null){
                    //System.out.println(x.right.val);
                q.add(x.right);
                }
            }
            if(r.size()>0){
            res.add(r.get(r.size()-1));
            }
        }
        return res;
    }
}
