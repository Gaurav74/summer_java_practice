package stack7;

//import java.util.*;

public class reversestring {

public static void reverse(String str,int len,int temp){
if(temp==len){

}
else{
	int temp1=temp;
  reverse(str,len,++temp);
System.out.print(str.charAt(temp1));
}


}



public static void main(String args[]){
//Scanner s=new Scanner(System.in);
String str="";//s.nextLine();
str="hello world";
int len=str.length();
reverse(str,len,0);
//s.close();
}



}
