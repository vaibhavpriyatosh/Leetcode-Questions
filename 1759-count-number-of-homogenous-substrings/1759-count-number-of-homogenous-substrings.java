class Solution {
    public int countHomogenous(String s) {
        
        int len=s.length();
        long sum=0;
        
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            long temp=0;
            while(i<len && c==s.charAt(i)){
                temp++;
                i++;
            }
            sum+=(temp*(temp+1))/2;
            i--;
        }
        
        return (int)(sum%1000000007);
        
    }
}