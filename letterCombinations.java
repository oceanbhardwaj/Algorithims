class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<String>();
        if(digits.length()==0)
            return ans;
        HashMap<Integer,String> h=new HashMap<>();
        h.put(2,"abc");
        h.put(3,"def");
        h.put(4,"ghi");
        h.put(5,"jkl");
        h.put(6,"mno");
        h.put(7,"pqrs");
        h.put(8,"tuv");
        h.put(9,"wxyz");
        helper(digits,h,new StringBuilder(),ans,0);
        return ans;
    }
    public void helper(String digits,HashMap<Integer,String> h,StringBuilder sb,List<String> list,int index){
        if(sb.length()==digits.length())
        {
            list.add(sb.toString());
            return;
        }
        String s=h.get(digits.charAt(index)-'0');
        for(int j=0;j<s.length();j++){
            sb.append(s.charAt(j));
            helper(digits,h,sb,list,index+1);
            sb.deleteCharAt(sb.toString().length()-1);
        }
    }
}
------------------------------------------------------------------------------------------------------
class Solution {
    public List<String> letterCombinations(String digits) {
       //using queue
        Queue<String> q1=new LinkedList<>();
        Queue<String> q2=new LinkedList<>();
                List<String> ans=new ArrayList<>();

        if(digits.length()==0)
            return ans;
        
        String arr[]={"","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
         String s=arr[digits.charAt(0)-'0'];
        for(int i=0;i<s.length();i++){
            q1.add(s.charAt(i)+"");
        }
        helper(q1,q2,ans,digits,arr);
        return ans;
    }
    public void helper(Queue<String>q1,Queue<String> q2,List<String> ans,String digits,String arr[]){
        
       
        for(int i=1;i<digits.length();i++){
            
             String s1=arr[digits.charAt(i)-'0'];
            while(!q1.isEmpty()){
              String popped=q1.poll();
                for(int j=0;j<s1.length();j++){
                    String str=popped+s1.charAt(j);
                    q2.add(str);
                }
            
            
            }
            //swap
            Queue<String> temp=q1;
            q1=q2;
            q2=temp;
            
            
            
            
        }
        
        while(!q1.isEmpty()){
            ans.add(q1.poll());
        }
        
        
        
        
        
    }
}