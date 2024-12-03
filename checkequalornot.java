import java.util.*;
class checkequalornot{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
if((a^b)==0)
{
    System.out.println("the given two number is equal ");
}
else
{
    System.out.println("The given two number is not equal");
}
    }
}