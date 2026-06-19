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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
            if (preorder.length == 0) return null;    
            int root =preorder[0];
            TreeNode rootNode =new TreeNode(root);
            int  splitIndex=findSplit(inorder,root);
            int[] leftTree = Arrays.copyOfRange(inorder, 0, splitIndex);
            int[] rightTree = Arrays.copyOfRange(inorder,  splitIndex+1,inorder.length);

           rootNode.left = buildTree(Arrays.copyOfRange(preorder, 1, leftTree.length+1),leftTree);
           rootNode.right = buildTree(Arrays.copyOfRange(preorder, leftTree.length+1,preorder.length),rightTree);
            return rootNode;

    }
    

    public int findSplit(int[] list,int root){
            for(int i=0;i<list.length;i++){
                if(root==list[i]){
                    return i;
                }
            }
            return 0;
    }
}
