class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                stack1.add(i);
            else if(s.charAt(i)=='*')
                stack2.add(i);
            else
            {
                if(stack1.isEmpty() && stack2.isEmpty())
                    return false;
                if(!stack1.isEmpty())
                    stack1.pop();
                else
                    stack2.pop();
            }
        }
        
        while(!stack1.isEmpty() && !stack2.isEmpty())
        {
            if(stack1.peek()>stack2.peek())
                return false;
            stack1.pop();
            stack2.pop();
        }
        return stack1.isEmpty();
    }
}