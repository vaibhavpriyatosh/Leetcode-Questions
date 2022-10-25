class Solution {
    public static int maxArea(int[] height) {
    
        int max=0;
        int i=0,j=height.length-1;
        while(i<=j){
            int curr = (j-i) * Math.min(height[i],height[j]);
            max = Math.max(curr,max);
            if(height[i]<height[j]) i++;
            else j--;
        }
        return max;
	

    }
}