class Solution {
    public int longestContinuousSubstring(String s) {
        
        int len=s.length(),max=0;
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            int temp=1;
            while(i+1<len && s.charAt(i+1)-s.charAt(i)==1){
                i++;temp++;
            }
            max=Math.max(max,temp);
        }
        return max;
    }
}