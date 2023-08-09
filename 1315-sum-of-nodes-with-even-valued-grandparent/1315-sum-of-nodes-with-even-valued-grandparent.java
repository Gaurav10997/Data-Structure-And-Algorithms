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
    int sum = 0 ;
    public int sumEvenGrandparent(TreeNode root) {
        helper(root);
        return sum ; 
    }
    public void helper(TreeNode root){
        if(root==null){
            return;
        }
        if(root.val%2==0) twolevel(root,2);
        sumEvenGrandparent(root.left);
        sumEvenGrandparent(root.right);
        
    }
     public void twolevel(TreeNode root , int count){
         if(root==null){
             return;
         }
         if(count==0){
             sum+=root.val;
         }
         
         twolevel(root.left,count-1);
         twolevel(root.right, count-1);
     }
}