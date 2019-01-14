public class TwoDimensionalArray
{
   public static void main(String [] args)
   { 
     int [][]x=new int [3][];

     x[0]=new int[]{0,1,2,3};
     x[1]=new int[]{0,1,2};
     x[2]=new int[]{0,1,2,3,4};
    
     for(int i=0;i<x.length;i++)
     {
      for(int j=0;j<x[i].length;j++)
       {
         System.out.print(x[i][j]);
       }    
        System.out.print("\n");
     } 
   }
}
