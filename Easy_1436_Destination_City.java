class Solution {
    public String destCity(List<List<String>> paths) {
        String s ="";
        List<String> list_out = new ArrayList<>();
        List<String> list_in = new ArrayList<>();
        
        for(int i=0;i<paths.size();i++)
        {
            list_out.add(paths.get(i).get(0));
            list_in.add(paths.get(i).get(1));
        }
        
        for(int i=0;i<list_out.size();i++)
        {
            if(list_in.contains(list_out.get(i)))
                list_in.remove(list_out.get(i));
        }
        
        return list_in.get(0);
    }
}