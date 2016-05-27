import java.io.*;
import java.util.Scanner;
public class OddEven
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i=0;
if(sc.hasNext())
i=sc.nextInt();
 if(i%2==0)
 {
 System.out.println("the number is even");
 }
 else
 {
 System.out.println("the number is odd");
 }
}
}


