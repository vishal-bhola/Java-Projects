import java.util.Scanner;
// Other imports go here// Do NOT change the class name
public class SwapTwoVariables
{
  public static void main(String[] args)
  {
     int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Value of a");
    a=sc.nextInt();
    System.out.println("Enter Value of b");
    b=sc.nextInt();
    
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println("a="+a);
    System.out.println("b="+b);
  }
}