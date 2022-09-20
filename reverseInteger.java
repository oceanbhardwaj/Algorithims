class Solution {
    public int reverse(int x) {
      
        boolean flag=false;
        if(x<0)
        { flag=true;
         x=-1*x;
        }
        long num=0;
        while(x!=0){
            int mod=x%10;
            num=num*10+mod;
             if(num<Integer.MIN_VALUE || num>Integer.MAX_VALUE)
                return 0;
            x=x/10;
        }
       
        return flag?-1*(int)num:(int)num;
    }
}