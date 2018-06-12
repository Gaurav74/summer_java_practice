package summer_java_practice;

import java.util.*;

class lambda{

public static void main(String args[]){

List<Integer> list =Arrays.asList(1,2,4,8,3,6);
list.stream().distinct().forEachOrdered(System.out::print);
System.out.println();
list.stream().filter(s->(int)s%2==0).map(s->s+1).forEach(s->System.out.print(s+" "));





}

}
