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
    public int goodNodes(TreeNode root) {
        return good(root,Integer.MIN_VALUE);
    }
    public static int good(TreeNode root,int num){
        if(root==null)return 0;
        int temp=0;
        if(num<=root.val){
            temp++;
            num=root.val;
        }
        return temp+good(root.left,num)+good(root.right,num);
    }
}