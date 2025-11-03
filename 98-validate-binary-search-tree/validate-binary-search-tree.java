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
    public void valid(List<Integer> list,TreeNode root){
        if(root==null)return;
        valid(list,root.left);
        list.add(root.val);
        valid(list,root.right);
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> list =new ArrayList<>();
        valid(list,root);

        if(list.size()<=1){
            return true;
        }
        boolean valid = true;
        int prev=list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i)<= list.get(i-1)){
              return false;
            }
        }
        return true;
    }
}