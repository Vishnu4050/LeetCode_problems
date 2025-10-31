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
    public boolean isIdentical(TreeNode root,TreeNode sub){
        if(sub==null && root==null)return true;
        if(sub==null||root==null)return false;
        if(root.val==sub.val){
        return isIdentical(root.left,sub.left) && isIdentical(root.right,sub.right);
        }
        return false;
    }
    public boolean isSubtree(TreeNode root, TreeNode sub) {
        if(sub==null)return true;
        if(root==null)return false;
        if(root.val==sub.val){
            if(isIdentical(root,sub))return true;
        }
        return isSubtree(root.left,sub) || isSubtree(root.right,sub);
    }
}