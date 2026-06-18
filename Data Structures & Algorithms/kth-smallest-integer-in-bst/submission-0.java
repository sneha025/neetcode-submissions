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
    public int kthSmallest(TreeNode root, int k) {

        //dfs traverssal and get the node put it in the queue;
         PriorityQueue<Integer> queue = new PriorityQueue<>();
         dfs(root,queue);

         for(int i=1;i<k;i++){
            queue.poll();
         }
        return queue.peek();


        
    }

    public void dfs(TreeNode root,Queue queue){
        if(root==null){
            return;
        }
        queue.offer(root.val);
        dfs(root.left,queue);
        dfs(root.right,queue);
       
    }
}
