class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        String[] str;
        String[] t,s;
        boolean flag=false;
        for(int i=0;i<emails.length;i++)
        {
            flag=false;
            str = emails[i].split("@");
            String unique_string="";
            if(str[0].contains("+"))
            {
                s = str[0].split("\\+");
                unique_string += s[0];
                flag=true;

            }
            if(str[0].contains("."))
            {
                if(flag==true)
                   t = unique_string.split("\\.");
                else
                   t = str[0].split("\\.");
                flag=true;
                unique_string="";
                
                for(int j=0;j<t.length;j++)
                {
                    unique_string +=t[j];
                }
            }
            if(flag==false)
                unique_string += str[0];
            
            unique_string += "@"+str[1];
            if(!set.contains(unique_string))
                set.add(unique_string);
            
        }
        return set.size();
    }
}