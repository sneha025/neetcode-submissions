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
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue =new LinkedList<>();

        if(root==null){
            return root;
        }
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode currentNode =queue.poll();
            if(currentNode.left!=null && currentNode.right!=null){
               
                    TreeNode tempNode =currentNode.right;
                    currentNode.right =currentNode.left;
                    currentNode.left=tempNode;
                     queue.offer(currentNode.left);
                    queue.offer(currentNode.right);
            }
            else if(currentNode.left!=null && currentNode.right==null){
                 currentNode.right=currentNode.left;
                 currentNode.left=null;
                 queue.offer(currentNode.right);
            }

             else if(currentNode.left==null && currentNode.right!=null){
                 currentNode.left=currentNode.right;
                 currentNode.right=null;
                 queue.offer(currentNode.left);
            }
            


        }
        return root;
        
    }
}
