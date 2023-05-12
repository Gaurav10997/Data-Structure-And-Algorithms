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
        return buildtree(0,0,inorder.length-1 , preorder ,inorder);
    }
    public TreeNode buildtree(int preorderIdx , int inordersIdx , int inordereIdx, int[] preorder, int[] inorder ){
        if(preorderIdx>=preorder.length || inordersIdx > inordereIdx ){
            return null;
        }
         TreeNode root = new TreeNode(preorder[preorderIdx]);
         int index= 0 ; 
         for(int i = inordersIdx ; i<= inordereIdx ;i++){
             if(root.val == inorder[i]){
                 index = i ;
             }
         }
        
        root.left = buildtree( preorderIdx+1 , inordersIdx , index-1 , preorder , inorder   );
        root.right = buildtree(preorderIdx+index-inordersIdx+1 , index+1 , inordereIdx, preorder , inorder);
        return root;
    }
}