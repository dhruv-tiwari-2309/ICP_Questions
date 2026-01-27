import java.util.*;
public class min_string_len_after_romoving_subs{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && (st.peek()=='A' && s.charAt(i)=='B')){
                st.pop();
            }
            else if(!st.isEmpty() && (st.peek()=='C' && s.charAt(i)=='D')){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        System.out.println(ans.length());
    }
}