import java.util.*;

public class Student
{
	String name;
	int id;
	String dept;
	int m1,m2,m3;
	double avg;
	void accept_stud()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the name of student ");
		name = s.nextLine();
		System.out.print("Enter your Department: ");
		dept = s.nextLine();
		System.out.print("Enter your ID: ");
		id = s.nextInt();		
		System.out.print("Enter your marks in subject 1: ");
		m1 = s.nextInt();
		System.out.print("Enter your marks in subject 2: ");
		m2 = s.nextInt();
		System.out.print("Enter your marks in subject 3: ");
		m3 = s.nextInt();
		calc_avg();
		
	}
	void display()
	{
		System.out.println("name of student: "+ name);
		System.out.println("ID: "+ id);
		System.out.println("Department: "+ dept);
		System.out.println("Marks in subject 1: "+m1);
		System.out.println("Marks in subject 2: "+m2);
		System.out.println("Marks in subject 3: "+m3);
		System.out.println("Average Marks: "+avg);
	}
	void calc_avg()
	{
		avg = (m1+m2+m3)/3.0;
	}
	
	static void SearchStudID( Student s[], int count, int id)
	{
		for(int i = 0; i < count; i++)
		{
			if(s[i].id == id)
			{
				System.out.println("Element fount at "+ i);
				s[i].display();
				return;
			}
		}
		System.out.println("Element not fount at ");
	} 
	static void SearchStudName( Student s[], int count, String name)
	{
		for(int i = 0; i < count; i++)
		{
			if(s[i].name.equals(name))
			{
				System.out.println("Element fount at "+ i);
				s[i].display();
				return;
			}
		}
		System.out.println("Element not fount at ");
	} 
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int n = s.nextInt();
		Student stud[] = new Student[n];
		for(int i = 0; i < n; i++)
		{
			System.out.println("Details of student:  "+(i+1));
			stud[i] = new Student();
			stud[i].accept_stud();
		}
		System.out.println("Details of students: ");
		for(int i = 0; i < n; i++)
		{
			System.out.println("Details of student:  "+(i+1));
			stud[i].display();
		}
		System.out.println("Enter the ID of student to be searched: ");
		int id = s.nextInt();
		SearchStudID(stud,n,id);
		s.nextLine();
		System.out.println("Enter the name of student to be searched: ");
		String name = s.nextLine();
		SearchStudName(stud,n,name);
	}
	
}
