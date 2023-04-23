/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void kDown(TreeNode root , int k , TreeNode blockNode,ArrayList<Integer> ans ){
        if(root==null || k < 0 || root==blockNode){
            return;
        }
        if(k==0){
            ans.add(root.val);
            return ;
        }
        kDown(root.left, k-1 ,blockNode , ans);
        kDown(root.right, k-1 ,blockNode , ans);
    }
    public int distanceKhelper(TreeNode root , TreeNode target , int k, ArrayList<Integer> ans){
        if(root==null){
            return -1;
        }
        if(root==target){
            kDown(root,k,null,ans);
            return 1;
        }
        
        int ld = distanceKhelper(root.left,target,k,ans);
        if(ld!=-1){
            kDown(root,k-ld,root.left,ans);
              return ld+1;
        }
      
        int rd = distanceKhelper(root.right,target,k,ans);
        if(rd!=-1){
            kDown(root,k-rd,root.right,ans);
              return rd+1;
        }
        
        return -1;
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        distanceKhelper(root,target,k,li);
        return li;
    }
}