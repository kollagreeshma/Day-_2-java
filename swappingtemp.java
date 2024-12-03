import java.util.*;
class swappingtemp{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int temp=a;
a=b;
b=temp;
String res=String.format("after swapping\n a=%d \n b=%d",a,b);
System.out.println(res);
    }
}