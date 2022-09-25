class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        if(s==null || s.length()==0)
            return true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.isEmpty())
                stack.push(ch);
            else if(!stack.isEmpty() && stack.peek()=='{' && ch=='}')
                    stack.pop();
                else if(!stack.isEmpty() && stack.peek()=='[' && ch==']')
                    stack.pop();
                 else if(!stack.isEmpty() && stack.peek()=='(' && ch==')')
                     stack.pop();
            else
                stack.push(ch);
        }
        return stack.isEmpty()?true:false;
    }
}