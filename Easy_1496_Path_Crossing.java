class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int xcor = 0, ycor =0;
        String s = xcor + "#" +ycor;
        set.add(s);
        for(int i=0;i<path.length();i++)
        {
            if(path.charAt(i)=='N')
            {
                xcor++;
                
            }
            else if(path.charAt(i)=='S')
            {
                 xcor--;
            }
            else if(path.charAt(i)=='E')
            {
                 ycor++;
            }
            else
            {
                 ycor--;
            }
            
            s = xcor + "#" + ycor;
            if(set.contains(s))
            {
                return true;
            }
            else
            {
                set.add(s);
            }
        }
        return false;
    }
}