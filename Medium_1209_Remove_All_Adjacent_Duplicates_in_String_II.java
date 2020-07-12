class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb= new StringBuilder(s);
        boolean flag=false;
        for(int i=0;i<sb.toString().length()-k+1;i++)
        {
            int count = k;
            while(count>0)
            {
                if(sb.charAt(i) == sb.charAt(i+count-1))
                {  
                    flag=true; 
                    count--;
                    continue;
                }
                else
                {
                    flag=false;
                    count--;
                    break;
                }
            }
            
            if(flag==true)
            {
                flag=false;
                sb.delete(i,i+k);
                i=-1;
            }
        }
        return sb.toString();
    }
}