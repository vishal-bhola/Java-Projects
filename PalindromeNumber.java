import java.util.Scanner;

// Other imports go here// Do NOT change the class name

class PalindromeNumber
{
    public static void main(String[] args)
    {
        int num;
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      int n=num;
      int sum=0;
      int j;
        while(num>0)
        {
          j=num%10;
          sum=sum*10+j;
          num/=10;
        }
        
        if(sum==n)
          System.out.println("Palindrome");
        else
          System.out.println("Not Palindrome");

    }
}