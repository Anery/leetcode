class Solution {
    public String read(String s){
        int count=1;
        String read="";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1))
                count++;
            else{
                read = read + count + s.charAt(i);
                count = 1;
            }
        }
        read = read + count + s.charAt(s.length() - 1);
        return read;
    }
    
    public String countAndSay(int n) {
        String s = "1" , a = "1";
        for(int i=1;i<n;i++){
            a = read(s);
            s=a;
        }
        return a;
    }
}
