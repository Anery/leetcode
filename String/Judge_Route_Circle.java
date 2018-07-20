class Solution {
    public boolean judgeCircle(String moves) {
        if(moves.length() %2 != 0)
            return false;
        int c1=0,c2=0,c3=0,c4=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i) == 'U') c1++;
            if(moves.charAt(i) == 'D') c2++;
            if(moves.charAt(i) == 'L') c3++;
            if(moves.charAt(i) == 'R') c4++;
        }
        if(c1 == c2 && c3 == c4)
            return true;
        return false;
    }
}
