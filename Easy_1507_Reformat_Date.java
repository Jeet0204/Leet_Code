class Solution {
    public String reformatDate(String date) {
        String[] str = date.split(" ");
        String result = "";
        List<String> list = new ArrayList<>();
        list.add("Jan");
        list.add("Feb");
        list.add("Mar");
        list.add("Apr");
        list.add("May");
        list.add("Jun");
        list.add("Jul");
        list.add("Aug");
        list.add("Sep");
        list.add("Oct");
        list.add("Nov");
        list.add("Dec");
        
        result += str[str.length-1]+"-";
        if((list.indexOf(str[1])+1)<= 9)
        {
            result += "0"+Integer.toString(list.indexOf(str[1])+1)+"-";
        }
        else
            result += Integer.toString(list.indexOf(str[1])+1) + "-";
        
        if(Integer.parseInt(str[0].substring(0,str[0].length()-2))<=9)
            result+= "0"+str[0].substring(0,str[0].length()-2);
        else
            result+= str[0].substring(0,str[0].length()-2);
        
        return result;
    }
}