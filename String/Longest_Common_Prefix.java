class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = "";
        char mark=' ';
        if(strs.length == 0)
            return common;
        int min=strs[0].length();
        for(int i=1;i<strs.length;i++){
            if(strs[i].length() < min)
                min=strs[i].length();
        }
        for(int j=0;j<min;j++)
        {
            mark = strs[0].charAt(j);
            for(int k=1;k<strs.length;k++){  
                if(strs[k].charAt(j) != mark)
                    return common;
            }
            common = common + mark;
        }
        
        return common;
    }
}
