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
    public boolean isSymmetric(TreeNode root) {
       if(root==null)return true;
       Queue<TreeNode> leftNode=new LinkedList<>();
       Queue<TreeNode> rightNode=new LinkedList<>();

       leftNode.add(root.left);
       rightNode.add(root.right);

       while(!leftNode.isEmpty() && !rightNode.isEmpty()){
        TreeNode leftnode=leftNode.poll();
        TreeNode rightnode=rightNode.poll();

        if(leftnode==null && rightnode==null)continue;
        if(leftnode==null || rightnode==null)return false;
        if(leftnode.val != rightnode.val)return false;
        
        leftNode.add(leftnode.left);
        leftNode.add(leftnode.right);
        rightNode.add(rightnode.right);
        rightNode.add(rightnode.left);
       }
       return true;
    }
}