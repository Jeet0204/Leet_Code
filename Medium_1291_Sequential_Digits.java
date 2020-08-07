class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        List<Integer> list = new ArrayList<>();
        recr(low, high, s, 1,list);
        Collections.sort(list);
        return list;
    }
    
    public void recr(int low, int high, String s, int k, List<Integer> list)
    {
        for(int i=0;i+k<=s.length();i++)
        {
            if(Integer.parseInt(s.substring(i,i+k))<low )
            {
                recr(low, high, s,k+1, list);
            }
            else if(Integer.parseInt(s.substring(i,i+k))<high && !list.contains(Integer.parseInt(s.substring(i,i+k))))
            {
                list.add(Integer.parseInt(s.substring(i,i+k)));
            }
            else if(k<9 )
            {
                k=k+1;
                i=-1;
            }
            else
                break;
                  
        }
    }
}