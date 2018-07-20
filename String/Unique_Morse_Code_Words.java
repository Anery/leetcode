class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        java.util.Map<Character,String> map = new java.util.HashMap<Character,String>();
        map.put('a',".-");map.put('b',"-...");map.put('c',"-.-.");map.put('d',"-..");
        map.put('e',".");map.put('f',"..-.");map.put('g',"--.");map.put('h',"....");
        map.put('i',"..");map.put('j',".---");map.put('k',"-.-");map.put('l',".-..");
        map.put('m',"--");map.put('n',"-.");map.put('o',"---");map.put('p',".--.");
        map.put('q',"--.-");map.put('r',".-.");map.put('s',"...");map.put('t',"-");
        map.put('u',"..-");map.put('v',"...-");map.put('w',".--");map.put('x',"-..-");
        map.put('y',"-.--");map.put('z',"--..");
        
        String y = "";
        
        java.util.Set<String> set=new java.util.HashSet<String>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                String x = map.get(words[i].charAt(j));
                y = y + x;
            }
            set.add(y);
            y = "";
        }
        return set.size();
    }
}
