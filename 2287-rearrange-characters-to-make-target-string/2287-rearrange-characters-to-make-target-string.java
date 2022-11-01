class Solution {
    public int rearrangeCharacters(String s, String target) {
        
        int ch[]=new int[26];
        int temp[]=new int[26]; 
        
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<target.length();i++){
            temp[target.charAt(i)-'a']++;
        }
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i<=25;i++){
            if(temp[i]==0)continue;
            ans=Math.min(ans,ch[i]/temp[i]);
        }
        return ans;
    }
}
