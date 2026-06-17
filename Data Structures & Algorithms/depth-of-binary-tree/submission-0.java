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
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        int h=1;
        return Math.max(depth(root.left,h),depth(root.right,h));

        
        
    }

    public int depth(TreeNode root,int height){
        if(root ==null){
            return height;
        }

        return Math.max(depth(root.left,height+1),depth(root.right,height+1));
    }
}
