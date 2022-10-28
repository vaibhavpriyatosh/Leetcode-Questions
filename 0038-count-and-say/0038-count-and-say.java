class Solution {
    public static String cntsy(int num){
        if(num==1)
            return "1";//no more counting

        String s=cntsy(num-1);
        int n=s.length();

        int k=0;
        String neww="";

        for(int i=0;i<n;i++){
            char c1=s.charAt(i);
            k=0;

            while(i<n && c1==s.charAt(i)){
                k++;i++;
            }

            i--;

            neww=neww+k+""+c1;

        }

        return neww;
    

    }
    public String countAndSay(int n) {
      return cntsy(n);  
    }
}
