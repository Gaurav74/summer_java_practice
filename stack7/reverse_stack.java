package stack7;

import java.util.Stack;

public class reverse_stack {

public static Stack<Integer> reversestack(Stack<Integer> sf,Stack<Integer> ss){

while(!sf.empty()){
ss.push(sf.pop());

}
  return ss;
}

public static void main(String args[]){

Stack<Integer> sf=new Stack<>();
 Stack<Integer> ss=new Stack<>();
sf.push(1);
sf.push(4);
sf.push(8);
System.out.println(sf);
ss=reversestack(sf,ss);
System.out.println(ss);
//int a=ss.get(1);System.out.print(a);
//System.out.println(ss);
}
}
