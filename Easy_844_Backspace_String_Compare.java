class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='#')
                if(stack1.isEmpty())
                    continue
                else
                    stack1.pop();
            else
                stack1.push(S.charAt(i));
        }
        
        for(int i=0;i<T.length();i++)
        {
            if(T.charAt(i)=='#')
                if(stack2.isEmpty())
                    continue;
                else
                    stack2.pop();
            else
                stack2.push(T.charAt(i));
        }
        
        return stack1.equals(stack2);
        
    }
}