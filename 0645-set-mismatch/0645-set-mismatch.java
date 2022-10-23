class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]={-1,-1};
        
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0){
                arr[0]=index+1;continue;
            }
            nums[index]*=-1;
        }
        // System.out.println(Arrays.toString(nums));
        int temp=1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)arr[temp++]=i+1;
        }
        
        return arr;
    }
}