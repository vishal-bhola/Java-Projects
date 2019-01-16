import java.util.Scanner;

class InputFromUserUsingScanner
{
  public static void main(String[] args)
  { 
   int a,b,result;
   Scanner input=new Scanner(System.in);
   System.out.println("Enter two numbers");
   a=input.nextInt();
   b=input.nextInt();
    
   input.close();
   result=a/b;

   System.out.println("Result = "+result);
  }
   
   
}