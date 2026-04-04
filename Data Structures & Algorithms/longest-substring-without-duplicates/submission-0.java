class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>hp=new HashSet<>();
        int i=0;
        int res=0;
        for(int k=0;k<s.length();k++){
            while(hp.contains(s.charAt(k))){
                hp.remove(s.charAt(i));
                i++;
            }
            hp.add(s.charAt(k));
            res=Math.max(res,k-i+1);
        }
        return res;
    }
}
