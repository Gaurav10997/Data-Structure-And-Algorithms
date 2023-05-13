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
    int count = 0;
    public int goodNodes(TreeNode root) {
        int max = Integer.MIN_VALUE;
        goodnodes(root , max);
        return count;
    }
    public TreeNode goodnodes(TreeNode root , int max){
        if(root==null){
            return null;
        }
        max = Math.max(root.val , max);
        TreeNode left = goodnodes(root.left , max);
        TreeNode right = goodnodes(root.right , max);
        if(root.val>=max){
            count++;
        }
        return root;
    }
}