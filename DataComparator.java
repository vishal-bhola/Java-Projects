import java.util.Collections;
import java.util.*;

class Student
{
	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
  
}


class Agecomparator implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		if (s1.age == s2.age)
			return 0;
		else if(s1.age>s2.age)
			return 1;
		else
			return -1;
	}
}

class Namecomparator implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		return (s1.name.compareTo(s2.name));
	}

}

public class DataComparator
{

	public static void main(String[] args) 
	{
        ArrayList<Student> a1 = new ArrayList<Student>();
        a1.add(new Student(101,"vijay",23));
        a1.add(new Student(106,"ajay",27));
        a1.add(new Student(105,"jai",21));
        
        System.out.println("Sorting by Name");
        
        Collections.sort(a1, new Namecomparator());
        for (Student st:a1)
        {
        	System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
        
        System.out.println("\nSorting By age");
        
        Collections.sort(a1, new Agecomparator());
        for (Student st:a1)
        {
        	System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
	 }

}
