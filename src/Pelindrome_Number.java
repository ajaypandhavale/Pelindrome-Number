import java.util.Scanner;

public class Pelindrome_Number{
public static void main(String[] args){

Scanner sc =new Scanner (System.in);

System.out.println("enter number to check wether the number is pelindrome or not");
int num=sc.nextInt();

int temp=num,sum=0,digit;
while (temp>0)
{
digit=temp%10;
sum=(sum*10)+digit;
temp/=10;

}

System.out.println("sum is  "+sum );

if (sum==num)
{
System.out.println("the number "+num +" is pelindrome number");
}
else
{
System.out.println("the number "+num +" is not pelindrome number");

}

System.out.println("update using branch branch name update");

System.out.println("update using branch stash branch name updates");


System.out.println("updating using github manually");

}


}
