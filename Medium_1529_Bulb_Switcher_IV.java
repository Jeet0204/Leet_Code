class Solution {
    public int minFlips(String target) {
        int change = 0;
        for(int i=0;i<target.length()-1;i++)
        {
            if(target.charAt(i)!=target.charAt(i+1))
                change++;
        }
        System.out.println(change);
        return (change==0 || target.charAt(0)=='0') ? change: change+1;
    }
}