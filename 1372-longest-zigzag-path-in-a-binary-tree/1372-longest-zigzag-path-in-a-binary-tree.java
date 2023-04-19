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
    int max = 0 ;
    public int longestZigZag(TreeNode root) {
        if(root==null){
            return 0 ;
        }
        
        helper(root.left , true , 0 );
        helper(root.right , false , 0);
        return max;
    }
    public void helper(TreeNode root, boolean b , int count){
        max = Math.max(count , max);
        if(root==null){
            return ;
        }
        
        helper(root.left , true, b==true ? 0:count+1 );
        helper(root.right , false, b==false ?0:count+1 );
        
    }
    
    
}