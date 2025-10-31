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
    public int checkdept(TreeNode root){
        if(root==null)return 0;
        int lefth=checkdept(root.left);
        int righth=checkdept(root.right);
        if(lefth==0 || righth==0){
            return Math.max(lefth,righth)+1;
        }
        int min=Math.min(lefth,righth)+1;
        return min;

    }
    public int minDepth(TreeNode root) {
        return checkdept(root);

    }
}