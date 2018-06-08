package stack7;

import java.util.*;

public class balanceparenthesis {

	public static boolean check(char p,char c) {
		boolean bool=false;
		switch(p) {
		
		case '(':
			if(c==')') bool=true;
		break;
		
		case '{' :
			if(c=='}') bool=true;
			break;
			
		case '[' :
			if(c==']') bool=true;
			break;

		
		}
		
		
		return bool;
	}
	
	
	
public static void main(String args[]){

Stack<Character> stack =new Stack<>();
//Scanner s=new Scanner(System.in);
//String str=s.next();
String str="{([";
boolean bool=true;
for(int i=0;i<str.length();i++){
char c=str.charAt(i);
if(c=='[' || c=='{' ||c=='('){
  stack.push(c);
}else{
  if(c==')' || c=='}' ||c==']') {
	  if(stack.empty()) {
		  System.out.println("not valid"); System.exit(0);
	  }
	  char p=stack.pop();
	  bool=check(p,c);
	  if(!bool) {
		  System.out.println("not valid1");
		  System.exit(0);
	  }
  }
}

}
if(bool && stack.empty()) {
	System.out.println("valid");
}else {
	System.out.print("not valid");
}


}
}
