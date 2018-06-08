package stack7;

public class twostack {

static int stack[]=new int[10],fpoint=-1,spoint=4;

public static void push1(int value){
if(fpoint==4){
System.out.println("stack 1  is full");
  }
  else{
    stack[++fpoint]=value;
  }
}


public static void push2(int value){
if(spoint==(9)){
System.out.println("stack 2  is full");
  }
  else{
    stack[++spoint]=value;
  }
}

public static void pop1(){

if(fpoint==(-1)){
System.out.println("Stack 1 is empty");

}
else{
System.out.println("stack 1 : "+stack[fpoint--]);

}
  
}

public static void pop2(){

if(spoint==(4)){
System.out.println("Stack 2 is empty");

}
else{
System.out.println("stack 2 : "+stack[spoint--]);

}

}



public static void main(String[] args) {
push1(1);
push1(2);
push1(8);
push1(5);
push1(3);
push1(9);

pop1();
pop1();

push2(5);
push2(3);
push2(9);
pop2();
pop2();
pop2();
pop2();
}


}
