class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String x: tokens){
            if(x.equals("+")){
                st.push(st.pop()+st.pop());
            }
            else if(x.equals("-")){
                int a=st.pop();
                int b=st.pop();
                st.push(b-a);
            }
            else if(x.equals("*")){
                st.push(st.pop()*st.pop());
            }
            else if(x.equals("/")){
                int a=st.pop();
                int b=st.pop();
                st.push(b/a);
            }
            else{
                st.push(Integer.parseInt(x));
            }
        }
        return st.pop();
    }
}
