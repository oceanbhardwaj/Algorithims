class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int max=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String str=s.substring(i,j+1);
                if(isPalindromic(str) && max<str.length()){
                    max=str.length();
                    start=i;
                    end=j;
                }
            }
        }
        return s.substring(start,end+1);
    }
    public boolean isPalindromic(String str){
        int low=0;
        int high=str.length()-1;
        while(low<high){
            if(str.charAt(low)!=str.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
}
-----------------------------------------------------------------------------------------------------------
class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        boolean dp[][]=new boolean[n][n];
        //one length
        int max=0;
        int start=0;
        int end=0;
        for(int i=0;i<n;i++){
            dp[i][i]=true;
            max=1;
            start=i;
            end=i;
        }
        
        //two length
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1))
            {
                dp[i][i+1]=true;
                max=2;
                start=i;
                end=i+1;
            }
        }
        
        for(int k=3;k<=n;k++){
            for(int i=0;i<=n-k;i++){
                int j=i+k-1;
                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1] ){
                    dp[i][j]=true;
                    if(max<k){
                        max=k;
                        start=i;
                        end=j;
                    }
                  
                    
                }
            }
        }
        return s.substring(start,end+1);
    }
}
-----------------------------------------------------------------------------------------------------------------------
class Solution {
    public String longestPalindrome(String s) {
        int max=1;
        int n=s.length();
        int start=0;
        for(int i=0;i<n;i++){
            int low=i-1;
            int high=i+1;
            while(low>=0 && low<high && high<n && s.charAt(low)==s.charAt(i))
            {
                low--;
            }
            while(low<high && high<n && s.charAt(i)==s.charAt(high))
            {
                high++;
            }
            while(low<high && low>=0 && high<n && s.charAt(low)==s.charAt(high)){
                low--;
                high++;
            }
            if(high-low-1>max){
                max=high-low-1;
                start=low+1;
            }
        }
        return s.substring(start,start+max);
    }
}
