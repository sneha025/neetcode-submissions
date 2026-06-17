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
        Queue<TreeNode> q1 =new LinkedList<>();
        Queue<TreeNode> q2 =new LinkedList<>();

      
        if(p == null && q == null)
            return true;

        if(p == null || q == null)
            return false;
        q1.offer(p);
        q2.offer(q);

        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode currentNode1 =q1.poll();
            TreeNode currentNode2 = q2.poll();

            if(currentNode1.val!=currentNode2.val){
                return false;
            }

            if(currentNode1.left!=null){
                q1.offer(currentNode1.left);
            }
             if(currentNode1.right!=null){
                q1.offer(currentNode1.right);
            }

             if(currentNode2.left!=null){
                q2.offer(currentNode2.left);
            }
              if(currentNode2.right!=null){
                q2.offer(currentNode2.right);
            }
            if(currentNode1.left == null &&
               currentNode2.left != null)
                          return false;

            if(currentNode1.left != null &&
               currentNode2.left == null)
                return false;
            if(currentNode1.right == null &&
   currentNode2.right != null)
    return false;

if(currentNode1.right != null &&
   currentNode2.right == null)
    return false;
           
        }

        if(q1.isEmpty() && q2.isEmpty()){
            return true;
        }else{
            return false;
        }
        
    }
}
