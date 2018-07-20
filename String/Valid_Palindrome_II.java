class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                if(s.charAt(i+1)==s.charAt(j))
                {
                    int i1=i+1,j1=j;
                    while(i1<j1){
                        if(s.charAt(i1)==s.charAt(j1)){
                            i1++;
                            j1--;
                        }
                        else
                            break;
                    }
                    if(i1 >= j1)
                        return true;
                }
                if(s.charAt(i)==s.charAt(j-1))
                {
                    int i1=i,j1=j-1;
                    while(i1<j1){
                        if(s.charAt(i1)==s.charAt(j1)){
                            i1++;
                            j1--;
                        }
                        else
                            return false;
                    }
                    return true;
                }
                return false;
                
            }
        }
        return true;
    }
}
