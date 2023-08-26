/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
  
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder("");
        serializeHelper(root,sb);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
    public void serializeHelper (TreeNode root , StringBuilder sb){
        if(root==null){
            sb.append("N,");
            return ;
        }
        sb.append(root.val+",");
        serializeHelper(root.left,sb);
        serializeHelper(root.right,sb);
    }
    

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        // System.out.println(data);
        String [] arr = data.split(",");
        // System.out.println(Arrays.toString(arr));
        
        return deserializeHelper(arr);
        // return null;
    }
    int index = 0 ;
    public TreeNode deserializeHelper(String arr []){
        if(index>=arr.length || arr[index].equals("N")){
            index++;
            return null;
        }
        TreeNode curr = new TreeNode(Integer.parseInt(arr[index++]));
        curr.left=deserializeHelper(arr);
        curr.right=deserializeHelper(arr);
        return curr;
    }
    
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));