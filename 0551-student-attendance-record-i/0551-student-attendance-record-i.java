class Solution {
    public boolean checkRecord(String s) {
        
        int absent=0;
        int len=s.length();
        
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            if(c=='L' && i<=len-3 && s.charAt(i+1)=='L' && s.charAt(i+2)=='L')
                return false;
            else if(c=='A')
                absent++;
            if(absent==2)
                return false;
        }
        
        return true;
        
    }
}