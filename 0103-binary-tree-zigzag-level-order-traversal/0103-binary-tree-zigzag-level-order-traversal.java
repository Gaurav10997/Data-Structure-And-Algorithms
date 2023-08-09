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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans ;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean b = true;
        while(!q.isEmpty()){
            int size = q.size();
           
            List<Integer> list = new ArrayList<>();
            b=!b;
            while(size-->0){
               
                TreeNode toremove = q.remove();
                list.add(toremove.val);
                if(toremove.left!=null){
                    q.add(toremove.left);
                }
                if(toremove.right!=null){
                    q.add(toremove.right);
                }

            }
            if(b){
                 Collections.reverse(list);
            }
           
            ans.add(list);
           
        }
        return ans;
        
    }
}