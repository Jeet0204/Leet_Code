class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> set=new HashSet<Character>();
        int count = 0;
        char[] ch =J.toCharArray();
        char[] ch_new =S.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(!set.contains(ch[i]))
                set.add(ch[i]);
        }
        for(int i=0;i<ch_new.length;i++)
        {
            if(set.contains(ch_new[i]))
                count++;
        }
        return count;
    }
}
