import java.util.Scanner;

class GrossSalary
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     int Basic=sc.nextInt();
    
    int Gross=Basic+(int)(0.1*Basic)+(int)(0.2*Basic);
    System.out.println(Gross);
  }
}