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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue  = new LinkedList<>();
        
        queue.add(root);
        boolean odd=true;
        
        while(!queue.isEmpty()){
            int len=queue.size();
            TreeNode temp=queue.peek();
            int comp=temp.val%2==0?Integer.MAX_VALUE:Integer.MIN_VALUE;
            
            for(int i=0;i<len;i++){
                
                temp=queue.poll();
                if(odd){
                    if(comp>=temp.val || temp.val%2==0)return false;
                    comp=temp.val;
                }
                else{
                    if(comp<=temp.val || temp.val%2==1)return false;
                    comp=temp.val;
                }
                
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
                
            }
            
            odd=!odd;
        }
        return true;
    }
}