class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map=new HashMap<Character,Character>();
        Stack<Character> stack=new Stack<Character>();
        map.put(']', '[');
        map.put(')', '(');
        map.put('}', '{');
        
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                char top=stack.empty()?'@':stack.pop();
                if(top != map.get(s.charAt(i)))
                    return false;
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}