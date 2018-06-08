package stack7;


public class stackintro {
static int array[]=new int[10],point=-1;

public static void push(int value){
if(point==9) {
  System.out.println("stack is full");
}
else
array[++point]=value;


}

public static int pop(){
if(point==(-1)){
   System.out.println("stack is empty");
return 0;
}
else
return array[point--];


}


public static void main(String args[]){

//int array[]=new int[10];
push(1);
push(3);
push(5);
System.out.println("pop : "+pop());
System.out.println("pop : "+pop());
System.out.println("pop : "+pop());
  System.out.println("pop : "+pop());
}


}
