import java.io.*;
import  java.util.*;
import java.lang.Math.*;


/*In each word find the Sum of Difference between the first letter and last letter,
 * second letter and the penultimate letter and so on till the center of word. 
 * 
 * Consider a=A=1 ,b=B=2, c=C=3 upto z=Z=26;
 * i.e acc. to english alphabetically order;
 */

public class FindStringCode
{
	public static void main(String[]args)
	{
		UserMainCode c=new UserMainCode();
		int d=c.findStringCode("World Wide Web");
		System.out.println(d);
	}
	
}



class UserMainCode
{

	public int findStringCode(String input1)
	{
		// Read only region end
		
		String s=input1.toUpperCase();
		
		//Split the String input1 acc to space.
		String [] p=s.split(" ");
		int mine[]=new int[10];
		int t=0;
		for(int i=0;i<p.length;i++) // p conatins each String as Seperated by space.
		{
		    int arr=0;
			
			char []q=p[i].toCharArray();
				int k=q.length;// Length of each Word
			arr=0;
	   if(k%2==0)//Check if the length of the word is even or odd if even then it will be executed
		{ 
			for(int j=0;j<k/2;j++)
			{
				arr+= Math.abs(q[j]-q[k-1-j]); 
				/* Subtract 1st letter from the last one and so on..*/
				
			}
				if(arr<0)
				arr*=-1; //Multiply by -1 in order to get +ve value
                mine[t++]=arr;
		  }
			else //Run if length of word is odd
			{
				for (int j=0;j<k/2;j++)
				{
					arr+=Math.abs(q[j]-q[k-1-j]);
				}
				arr=arr+q[k/2]-64;/*-64 as the value left is in ASCII code and we have to convert
				 acc. to english alphabet order*/ 
				
				
			    if(arr<0)
				arr*=-1; //Multiply by -1 in order to get +ve value
				mine[t++]=arr; 

			}
			

			
				
		}
		
		String str="";
		for(int k=0;k<t;k++)
		{
			str+=String.valueOf(mine[k]);
		}
		
		int c=Integer.parseInt(str);
		
		return c;
	   
		
	}
}

