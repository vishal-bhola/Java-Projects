import java.util.Scanner;

// Other imports go here// Do NOT change the class name

class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
      if(a%2==0)
        System.out.println("Even");
      else
        System.out.println("Odd");
    }
}