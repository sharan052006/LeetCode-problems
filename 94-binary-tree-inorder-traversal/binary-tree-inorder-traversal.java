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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        traversal(res,root);
        return res;
    }
    public void traversal(List<Integer> res, TreeNode temp){
        if(temp==null){
            return;
        }
        traversal(res,temp.left);
        res.add(temp.val);
        traversal(res,temp.right);
    }
}