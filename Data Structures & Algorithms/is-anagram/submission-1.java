class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character,Integer>hp=new HashMap<>();
        HashMap<Character,Integer>hp1=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if(hp.containsKey(s.charAt(i))){
                hp.put(s.charAt(i),hp.get(s.charAt(i))+1);
            }
            else{
                hp.put(s.charAt(i),1);
            }
        }
        
        for (int i=0;i<t.length();i++){
            if(hp1.containsKey(t.charAt(i))){
                hp1.put(t.charAt(i),hp1.get(t.charAt(i))+1);
            }
            else{
                hp1.put(t.charAt(i),1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(!hp1.containsKey(s.charAt(i)) || !hp.get(s.charAt(i)).equals(hp1.get(s.charAt(i)))){
                return false;
            }
        }
        return true;
    }

}