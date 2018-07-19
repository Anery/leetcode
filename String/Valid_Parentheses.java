class Solution {
    public boolean isValid(String s) {
        int index=-1;
        if(s.length() % 2 != 0)
            return false;
        if(s.length() == 0 )
            return true;
        java.util.List<Character> list = new java.util.ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                list.add(s.charAt(i));
            else{
                if(list.size() == 0)
                    return false;
                if(s.charAt(i) == ')')
                    if(list.get(list.size()-1) != '(')
                        return false;
                if(s.charAt(i) == ']')
                    if(list.get(list.size()-1) != '[')
                        return false;
                if(s.charAt(i) == '}')
                    if(list.get(list.size()-1) != '{')
                        return false;
                list.remove(list.size()-1);
            }
        }
        if(list.size()==0)
            return true;
        return false;
            
    }
}
