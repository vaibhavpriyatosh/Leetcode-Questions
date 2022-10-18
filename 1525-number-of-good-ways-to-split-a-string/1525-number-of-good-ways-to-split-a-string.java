class Solution {
    public int numSplits(String s) {
        
        HashMap<Character,Integer> left =new HashMap<>();
        HashMap<Character,Integer> right=new HashMap<>();
        
        int len=s.length();
        
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            left.put(c,left.getOrDefault(c,0)+1);
        }
        
        int i=0;
        int count=0;
        
        while(i<len){
            char c=s.charAt(i++);
            right.put(c,right.getOrDefault(c,0)+1);
            left.put(c,left.getOrDefault(c,0)-1);
            if(left.get(c)==0)left.remove(c);
            if(left.size()==right.size())count++;
        }
        return count;
    }
}