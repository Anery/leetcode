class Solution {
    public String addBinary(String a, String b) {
        boolean add = false;
        String result = "" ;
        int la = a.length();
        int lb = b.length();
        if(la > lb)
            for(int i=0;i<(la-lb);i++)
                b = "0" + b;
        if(la < lb)
            for(int i=0;i<(lb-la);i++)
                a = "0" + a;
        for(int i = a.length()-1 ; i >= 0 ; i--){
            if(a.charAt(i) != b.charAt(i))
            {
                if(add)
                    result = "0" + result;
                else
                    result = "1"+ result; 
            }
            else{
                if(a.charAt(i) == '0')
                {
                    if(add){
                        result = "1" + result;
                        add=false;
                    }
                    else
                        result = "0"+ result;
                }
                if(a.charAt(i) == '1'){
                    if(add)
                        result = "1"+ result;
                    else
                    {
                        result = "0"+ result;
                        add = true;
                    }
                }
            }
        }
        if(add)
            result = "1" + result;
        return result;
    }
}
