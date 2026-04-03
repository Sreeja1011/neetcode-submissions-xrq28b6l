class Solution {
    public boolean isValid(String s) {
        if(s.length()==1){
            return false;
        }
        int j=s.length()-1;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char peek=st.peek();
                if(peek=='{'&& s.charAt(i)=='}'||
                peek=='('&&s.charAt(i)==')'||
                peek=='['&&s.charAt(i)==']'){
                st.pop();
                }
                else{
                    return false;
                }
                
            }
        }
        return st.isEmpty();
    }
}
