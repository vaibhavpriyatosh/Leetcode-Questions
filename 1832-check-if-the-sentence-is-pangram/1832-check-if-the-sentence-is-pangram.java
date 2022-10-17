class Solution {
    public boolean checkIfPangram(String sentence) {
        
        int arr[]=new int [26];
        
        int len=sentence.length();
        
        for(int i=0;i<len;i++){
            char c=sentence.charAt(i);
            if(c>='A' && c<='Z')return false;
            
            arr[c-'a']++;
            
        }
        
        for(int i=0;i<26;i++){if(arr[i]==0)return false;}
        
        return true;
        
    }
}