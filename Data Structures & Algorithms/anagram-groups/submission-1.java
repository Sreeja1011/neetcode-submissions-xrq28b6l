class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // String [] s= new String[strs.length];
        // for(int i=0;i<strs.length;i++){
        //     s[i]=strs[i];
        // }
        // int seen[]=new int[s.length];
        // Arrays.fill(seen,0);
        // List<List<String>>res=new ArrayList<List<String>>();
        // for(int i=0;i<s.length;i++){
        //     if (seen[i] == 1) continue;
        //     List<String>anagram=new ArrayList<String>();
        //     seen[i]=1;
        //     anagram.add(s[i]);
        //     String x=s[i];
        //     char []tochar =x.toCharArray();
        //     Arrays.sort(tochar);
        //     String sorted=new String(tochar); 
        //     for(int j=i+1;j<s.length;j++){
        //         if(seen[j]==0){
        //             String x1=s[j];
        //             char []tochar1 =x1.toCharArray();
        //             Arrays.sort(tochar1);
        //             String sorted1=new String(tochar1);
        //             if(sorted.equals(sorted1)){
        //                 seen[j]=1;
        //                 anagram.add(s[j]);
        //             }
        //         }
        //     }
        //     res.add(anagram);
        // }
        // return res;

        List<List<String>>res=new ArrayList<List<String>>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String x:strs){
            char [] ch= x.toCharArray();
            int count[]=new int[26];
            for(char a : ch){
                count[a - 'a']++;
            }
            String cntString = Arrays.toString(count);
            map.putIfAbsent(cntString,new ArrayList<>());
            map.get(cntString).add(x);
        }
    return new ArrayList<>(map.values());
    }
}
