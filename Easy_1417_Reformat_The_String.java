class Solution {
    public String reformat(String s) {
        if(s.length()==1)
            return s;
        
        List<Character> list_digit = new ArrayList<>();
        List<Character> list_character = new ArrayList<>();
        String final_string="";
        int count=0;
        
        for(int i=0;i<s.length();i++)
            if(Character.isDigit(s.charAt(i)))
                list_digit.add(s.charAt(i));
            else
                list_character.add(s.charAt(i));
        
        
        if(list_digit.size()==s.length() || list_character.size()==s.length() || list_digit.size()+1<list_character.size() || list_digit.size()>list_character.size()+1)
            return "";
        else if(s.length()%2==0)
        {
            for(int i=0;i<s.length()/2;i++)
            {
                final_string += Character.toString(list_character.remove(0)) + Character.toString(list_digit.remove(0)); 
            }
        }
        else
        {
            for(int i=0;i<s.length()/2;i++)
                if(list_character.size()>list_digit.size())
                    final_string += Character.toString(list_character.remove(0)) + Character.toString(list_digit.remove(0)); 
                else
                    final_string += Character.toString(list_digit.remove(0)) + Character.toString(list_character.remove(0)); 

            final_string += (list_character.size()>list_digit.size())?Character.toString(list_character.remove(0)):Character.toString(list_digit.remove(0));
        }
        return final_string;
    }
}