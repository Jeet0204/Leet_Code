class Solution {
    public int calPoints(String[] ops) {
        int sum=0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<ops.length;i++)
        {
            if(ops[i].equals("C"))
            {
                sum -= stack.pop();
            }
            else if(ops[i].equals("D"))
            {
                stack.push(2*stack.peek());
                sum += stack.peek();
            }
            else if(ops[i].equals("+"))
            {
                int add = stack.peek() + stack.get(stack.size()-2);
                stack.push(add);
                sum += add;
            }
            else
            {
                sum += Integer.parseInt(ops[i]);
                stack.push(Integer.parseInt(ops[i]));
            }
                
        }
        return sum;
    }
}