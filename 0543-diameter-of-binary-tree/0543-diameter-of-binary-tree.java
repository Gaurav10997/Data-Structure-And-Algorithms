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
public  class Pair {
    int diam ; 
    int ht ; 
    Pair(int diam , int ht){
        this.diam=diam ;
        this.ht = ht;
    }
}
class Solution {

    public int diameterOfBinaryTree(TreeNode root) {
      return helper(root).diam;
    }
    public Pair helper(TreeNode root){
        if(root==null){
            return new Pair(0,0);
        }
        Pair leftInfo = helper(root.left);
        Pair rightInfo = helper(root.right);
        
        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam), leftInfo.ht+rightInfo.ht);
        int ht = Math.max(leftInfo.ht , rightInfo.ht) +1;
        return new Pair(diam,ht);
    }
}