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
    public int maxLevelSum(TreeNode root) {
        int size=1;
        int temp=root.val;
        int k=0;
        
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            k++;
            int len=queue.size();
            int sum=0;
            
            for(int i=0;i<len;i++){
                TreeNode head=queue.poll();
                sum+=head.val;
                if(head.left!=null)queue.add(head.left);
                if(head.right!=null)queue.add(head.right);
            }
            
            if(temp<sum){
                temp=sum;
                size=k;
            }
            
        }
        return size;
    }
}