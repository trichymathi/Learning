package leetCodeProblems;

import java.util.Stack;

public class ValidParanthesis {
	
	  public static boolean isValid(String s) {
	      char[] ch = s.toCharArray();
	       Stack<Character> st = new Stack<Character>();
	       for(int i=0;i<ch.length;i++){
	        if(ch[i]=='(' || ch[i]=='[' || ch[i]=='{'){
	            st.push(ch[i]);
	        }
	        else if(ch[i]==')'){
	            if(!st.isEmpty() && st.peek()=='('){
	                st.pop();
	            }else{
	                return false;
	            }
	        }
	        else if(ch[i]==']'){
	            if(!st.isEmpty() && st.peek()=='['){
	                st.pop();
	            }else{
	                return false;
	            }
	        }
	        else if(ch[i]=='}'){
	            if(!st.isEmpty() && st.peek()=='{'){
	                st.pop();
	            }else{
	                return false;
	            }
	        }
	       }
	       return st.isEmpty();  
	    }

	public static void main(String[] args) {
		boolean flag=isValid("()");
		System.out.println(flag);
	}

}
