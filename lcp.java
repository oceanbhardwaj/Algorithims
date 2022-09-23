class Solution {
    public String longestCommonPrefix(String[] strs) {
      StringBuilder sb=new StringBuilder();
      int flag=0;
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || ch!=strs[j].charAt(i))
                {
                    flag=1;
                    break;
                }
               
            }
             if(flag==1)return sb.toString();
             sb.append(ch);
                    
        }
        return sb.toString();
    }
}
---------------------------------------------------
class Solution {
    public String longestCommonPrefix(String[] strs) {
     Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int c=0;
        while(c<first.length()){
            if(first.charAt(c)!=last.charAt(c))
                break;
            c++;
        }
        return first.substring(0,c);
    }
}
----------------------------------------------------
class Solution {
    public String longestCommonPrefix(String[] strs) {
    String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            
            while(strs[i].indexOf(prefix)!=0)
                prefix=prefix.substring(0,prefix.length()-1);
        }
        return prefix;
    }
}