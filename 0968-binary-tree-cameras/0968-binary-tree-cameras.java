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
    int notMonitored = 0 ; 
    int monitoredwithoutcam = 1 ; 
    int monitoredwithcam = 2;
    int camera = 0;
    public int minCameraCover(TreeNode root) {
        if(root==null){
            return 0 ;
        }
        
        int top = dfs(root); 
         return camera + (top == notMonitored ? 1 : 0);
    }
    public int dfs(TreeNode root){
        if(root==null){
            return monitoredwithoutcam;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        
        if(left==monitoredwithoutcam && right==monitoredwithoutcam){
            return notMonitored;
        }else if(left==notMonitored || right == notMonitored){
            camera++;
            return monitoredwithcam;
        }else{
             return monitoredwithoutcam;
        }
        
        
    }
}