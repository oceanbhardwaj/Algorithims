class Solution {
    public int myAtoi(String s) {
       // StringBuffer sb=new StringBuffer();
        
        long ans=0;
        s=s.trim();
        if(s.length()==0)
            return 0;
       // s=s.replace("//s+","");
        int i=0;
        boolean flag=false;
        if(s.charAt(0)=='+')
        {
            i++;
        }else if(s.charAt(0)=='-'){
         flag=true;
            i++;
        }
        for(;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                ans=ans*10+(ch-'0');
            }else{
                break;
            }
            if(!flag && ans>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(flag && -1*ans<Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
                
            }
         return flag?-1*(int)ans:(int)ans;
        }
       
    }
