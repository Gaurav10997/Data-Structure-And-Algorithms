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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> li = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        while(!st.isEmpty() || root!=null){
           while(root!=null){
               li.add(root.val);
               st.push(root);
               root=root.left ; 
           }
           
            root=st.pop().right;
            
            
        }
        return li;
        
        //call left until it becames null 
    }
}