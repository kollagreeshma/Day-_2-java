import java.util.*;
class evenoddand{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int a=1;
if((num&a)==0)
{
    System.out.println("the given number is even");
}
else
{
    System.out.println("The given number is odd");
}
    }
}