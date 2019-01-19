import java.util.Scanner;

class TotalAndAggregateMarks
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int Marks[]=new int[5];
    int i=0,Aggregate=0,j=0;
    for(j=0;j<5;j++)
    {
       Marks[j]=sc.nextInt();
    }
    
    for(i=0;i<5;i++)
    {
      Aggregate+=Marks[i];
    }
    
    System.out.println(Aggregate+" "+Aggregate/j);
  }
}