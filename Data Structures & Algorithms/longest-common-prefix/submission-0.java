class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length;
        StringBuilder s=new StringBuilder();
        String last=strs[n-1];
        for(int i=0;i<strs[0].length();i++){
            if(strs[0].charAt(i)==last.charAt(i)){
                s.append(strs[0].charAt(i));
            }
            else{
                break;
            }
        }
        return s.toString();
    }
}