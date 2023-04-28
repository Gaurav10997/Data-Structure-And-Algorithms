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
    public TreeNode bstFromPreorder(int[] preorder) {
        int leftv = Integer.MIN_VALUE;
        int rightv = Integer.MAX_VALUE;
        return helper(preorder,leftv,rightv);

    }
    int idx = 0;
    public TreeNode helper(int [] preorder , int leftv , int rightv){
        if(idx == preorder.length){
            return null;
        }
        if(preorder[idx]<leftv || preorder[idx]>rightv){
            return null;
        }
        int val = preorder[idx];
        TreeNode me = new TreeNode(val);
        idx++;
        me.left = helper(preorder,leftv,val-1);
        me.right = helper(preorder,val+1,rightv);
        return me;
    }
}