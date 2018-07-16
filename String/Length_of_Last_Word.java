class Solution {
    public int lengthOfLastWord(String s) {
        char[] c = s.toCharArray();
        int len=0;
        for(int i = c.length-1 ; i >= 0 ; i--){
            if(c[i] != ' ')
                len++;
            else if(len > 0)
                    break;
        }
        return len;
    }
    
}
