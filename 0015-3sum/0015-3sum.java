class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);//sorting
        
        List<List<Integer>> ll=new LinkedList<>();
        if(len<3)return ll;int previ=Integer.MAX_VALUE,prevj=Integer.MAX_VALUE;
        for(int i=0;i<len-1;i++){
            if(previ==nums[i])continue;
            for(int j=i+1;j<len;j++){
                if(prevj==nums[j])continue;
                int temp=nums[i]+nums[j];
                temp*=-1;
                int index=finding(nums,j+1,len-1,temp);
                if(index!=-1)ll.add(Arrays.asList(nums[i],nums[j],nums[index]));
                prevj=nums[j];
            }
            previ=nums[i];
        }
        return ll;
    }
    public static int finding(int []nums,int start,int end,int find){
        if(start>end)return -1;
        int mid=(start+end)/2;
        if(nums[mid]==find)return mid;
        else if(nums[mid]<find)return finding(nums,mid+1,end,find);
        else return finding(nums,start,mid-1,find);
    }
}
