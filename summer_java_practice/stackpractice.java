package summer_java_practice;

import java.util.*;

public class stackpractice {

	public static void main(String args[]){
		
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		System.out.println(s.pop());
		s.push(5);
		System.out.println(s.pop());
		s.push(s.pop());
		System.out.print(s.pop());
		
	}
	
}
