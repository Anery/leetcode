class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0)
            return 0;
        int l = needle.length();
        int i=0;
        boolean flag=true; //记录是否匹配成功
        while(i<haystack.length()){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(i+l-1 >= haystack.length())
                    return -1;
                for(int j=1;j<l;j++){
                    if(haystack.charAt(i+j) != needle.charAt(j))
                    {
                        flag=false;
                        break;
                    }
                    flag=true;
                }
                if(flag)
                    return i;
            }
            i++;
        }
        return -1;
    }
}
