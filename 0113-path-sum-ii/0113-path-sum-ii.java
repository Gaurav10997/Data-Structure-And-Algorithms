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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList <Integer> li = new ArrayList<>();
        helper(root,targetSum,ans,li,0);
        return ans;
    }
    public void helper(TreeNode root , int targetSum ,  List<List<Integer>> ans,ArrayList <Integer> li,int sum ){
        if(root==null){
            return;
        
        }
        sum+=root.val;
        li.add(root.val);
        if(sum==targetSum && root.left==null && root.right == null){
             ans.add(new ArrayList<Integer>(li));  
        }
        helper(root.left,targetSum,ans,li,sum);
        helper(root.right,targetSum,ans,li,sum);
        li.remove(li.size() - 1);        

    }
}