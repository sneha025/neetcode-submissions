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

        // //dfs traverssal and get the node put it in the queue;
        //  PriorityQueue<Integer> queue = new PriorityQueue<>();
        //  dfs(root,queue);

        //  for(int i=1;i<k;i++){
        //     queue.poll();
        //  }
        // return queue.peek();


            //Inorder traversal will give accesnding 

        List<Integer> list =new ArrayList<>();
        dfs(root,list);

        return list.get(k-1);

        
    }

    // public void dfs(TreeNode root,Queue queue){
    //     if(root==null){
    //         return;
    //     }
    //     queue.offer(root.val);
    //     dfs(root.left,queue);
    //     dfs(root.right,queue);
       
    // }


      public void dfs(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
       
    }


}
