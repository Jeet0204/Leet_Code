class Solution {
    public int minAddToMakeValid(String S) {
        int count =0;
        HashMap<Character,Character> map=new HashMap<Character,Character>();
        Stack<Character> stack=new Stack<Character>();
        map.put(']', '[');
        map.put(')', '(');
        map.put('}', '{');
        
        for(int i=0;i<S.length();i++)
        {
            if(map.containsKey(S.charAt(i)))
            {
                char top=stack.empty()?'@':stack.pop();
                if(top != map.get(S.charAt(i)))
                    count++;
                else
                    count--;
            }
            else
            {
                stack.push(S.charAt(i));
                count++;
            }
        }
        return count;
    }
}