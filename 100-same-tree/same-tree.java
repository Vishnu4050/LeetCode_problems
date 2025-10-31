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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)return true; 
        if(p==null||q==null)return false;
        Queue<TreeNode> ptree=new LinkedList<>();
        Queue<TreeNode> qtree=new LinkedList<>();
        ptree.add(p);
        qtree.add(q);
        while(!ptree.isEmpty()&&!qtree.isEmpty()){
            TreeNode pnode=ptree.poll();
            TreeNode qnode=qtree.poll();

            if(pnode==null&&qnode==null)continue;
            if(pnode==null||qnode==null)return false;
            if(pnode.val!=qnode.val)return false;

            ptree.add(pnode.left);
            ptree.add(pnode.right);
            qtree.add(qnode.left);
            qtree.add(qnode.right);
        }
        return true;

    }
}