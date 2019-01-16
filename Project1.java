import java.util.*;
import java.lang.String;


public class Project1 {

	public static void main(String[] args) 
	{
          int Empno=Integer.parseInt(args[0]);
	  int []EmpNo=new int[] {1001,1002,1003,1004,1005,1006,1007};
	  String []EmpName={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
	  	int []JoinDateD= {01 ,23, 12 ,29,16 ,1 ,12 };
	  	int []JoinDateM=  {04,8,11,01,07,01,06};
	  	int []JoinDateY= {9,12,8,13,5,0,6};
	  	String []DesgCode= {"e","c","k","r","m","e","c"};
	  	String []Dept={"R&D","PM","Acct","FrontDesk","Engg","Manufacturing","PM"};
	  	int []Basic= {20000,30000,10000,12000,50000,23000,29000};
	  	int []HRA= {8000 ,12000 ,8000 ,6000, 20000,9000,12000};
	  	int []IT= {3000,9000,1000,2000,20000,4400,10000};
	  	int []Da= {20000,32000,12000,15000,40000};
	  	
	  	int i=0;
	  	int j=0;
	  	
	  	
	  	int [] Salary=new int[7]; 
	  	int []DA=new int[7];
	   
	  	 for( i=0;i<7;i++)
	  	 {
	  	     if(DesgCode[i].equals("e"))
	  		 {
	  			 DA[j++]=20000;
	  		 }
	  		 
	  		 else if(DesgCode[i].equals("c"))
	  		 {
	  			 DA[j++]=32000;
	  		 }
	  			
	  		 else if(DesgCode[i].equals("k"))
	  		 {
	  			 DA[j++]=12000;
	  		 }
	  		 
	  		 else if(DesgCode[i].equals("r"))
	  		 {
	  			 DA[j++]=15000;
	  		 }
	  		 
	  		 else if(DesgCode[i].equals("m"))
	  		 {
	  			 DA[j++]=40000;
	  		 }
	  	 }
	  	
	  	
	  	 for(i=0;i<7;i++)
	  	 {
	  		 Salary[i]=Basic[i]+DA[i]+HRA[i]-IT[i];
	  	}
	  	 
	  	
	  	String[] Designation=new String[7];
	  	
	  	int t=0;
	  	for(i=0;i<7;i++)
	  	{
	  		if(DesgCode[i]=="e")
	  		{
	  			Designation[t]="Engineering";
	  			t++;
	  		}
	  		
	  		
	  		else if(DesgCode[i]=="c")
	  		{
	  		     Designation[t]="Consultant";
	  		     t++;
	  		}
	  		
	  		else if(DesgCode[i]=="k")
	  		{
	  		     Designation[t]="Clerk";
	  		     t++;
	  		}
	  		
	  		else if(DesgCode[i]=="r")
	  		{
	  		     Designation[t]="Receptionist";
	  		     t++;
	  		}
	  		
	  		else if(DesgCode[i]=="m")
	  		{
	  		     Designation[t]="Manager";
	  		     t++;
	  		}
	  		
	  		
	  	}
	  	
switch(Empno)
{
 	 
case 1001:
System.out.println("EmpNo "+ "EmName " + "Department "+"Designation "+"Salary \n");
System.out.println(EmpNo[0]+" "+EmpName[0]+"  "+Dept[0]+"    "+Designation[0]+"    "+Salary[0]+" ");
break;
		  		 
case 1002:
System.out.println("EmpNo "+ "EmName " + "Department "+"Designation "+"Salary \n");
System.out.println(EmpNo[1]+" "+EmpName[1]+"  "+Dept[1]+"    "+Designation[1]+"    "+Salary[1]+" ");
break;
	  		
case 1003:
System.out.println("EmpNo "+ "EmName " + "Department "+"Designation "+"Salary \n");
System.out.println(EmpNo[2]+" "+EmpName[2]+"  "+Dept[2]+"    "+Designation[2]+"    "+Salary[2]+" ");
break;
	  		 
	  		
case 1004:
System.out.println("EmpNo "+ "EmName " + "Department "+"Designation "+"Salary \n");
System.out.println(EmpNo[3]+" "+EmpName[3]+"  "+Dept[3]+"    "+Designation[3]+"    "+Salary[3]+" ");
break;
	  		
case 1005:
System.out.println("EmpNo "+ "EmName " + "Department "+"Designation "+"Salary \n");
System.out.println(EmpNo[4]+" "+EmpName[4]+"  "+Dept[4]+"    "+Designation[4]+"    "+Salary[4]+" ");
break;
	  		
case 1006:
System.out.println("EmpNo "+ "EmName " + "Department "+"Designation "+"Salary ");
System.out.println(EmpNo[5]+" "+EmpName[5]+"  "+Dept[5]+"    "+Designation[5]+"    "+Salary[5]+" ");
break;
	  		
	  		
case 1007:
System.out.println("EmpNo "+ "EmName " + "Department "+"Designation"+"Salary");	  System.out.println(EmpNo[6]+" "+EmpName[6]+"  "+Dept[6]+"    "+Designation[6]+"     "+Salary[6]+" ");
break;
	  		 
default:
 System.out.println("There is no employee with empid :"+Empno);
 break;
  }
	  	
	  	
	}

}
