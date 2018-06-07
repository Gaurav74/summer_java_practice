package summer_java_practice;

import java.util.*;

public class list_practice {

	
	public static void main(String args[]){

		List<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(7);
		for(int a:list) System.out.println(a);
		list.remove(0);
		for(int a:list) System.out.println(a);

		}	
}
