class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        helper(n,n,list,2*n,"");
        return list;
    }
    public void helper(int open,int closed,List<String> list,int total,String output){
        if(output.length()==total)
        {
            list.add(output);
            return;
        }
        if(open>0)
            helper(open-1,closed,list,total,output+"(");
        if(open<closed && closed>0)
            helper(open,closed-1,list,total,output+")");
    }
}