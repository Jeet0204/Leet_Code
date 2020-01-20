class Solution {
    public String decodeString(String s) {
       if (s.length() == 0) 
            return "";
         
        Stack<Integer> stack_num = new Stack<>();
        Stack<String> stack_str = new Stack<>();
        String string = "";
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int num = 0;
                while (Character.isDigit(s.charAt(i))) {
                    num = num * 10 + Character.getNumericValue(s.charAt(i));
                    i++;
                }
                stack_num.push(num);
            } 
            else if (ch == '[')
            {
                stack_str.push(string);
                i++;
                string = "";
            } 
            else if (ch == ']') 
            {
                int num = stack_num.pop();
                StringBuilder sb = new StringBuilder(stack_str.pop());
                for (int r = 0 ; r < num; r++) {
                    sb.append(string);
                }
                 
                string = sb.toString();
                i++;
            } 
            else 
            {
                string += ch;
                i++;
            }
        }
         
        return string;
    }
}