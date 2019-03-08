//Program to show working of Constructors and Constructor overloading
//A student dta program in which data is initialised using constructors
class Student
{	private int ID;
	private String Name;
	private int Age;

	Student()		//Default Constructor
	{	ID=100;
		Name="New Student";
		Age=18;
	}
	Student(int id, String name, int age)		//Parameterized Constructor
	{	ID=id;
		Name=name;
		Age=age;
	}
	void getdata()
	{	System.out.println("Student ID: "+ID);
		System.out.println("Student Name: "+Name);
		System.out.println("Student Age: "+Age);
	}
}

public class StudentData
{	public static void main(String args[])
	{	Student s1 = new Student();
		Student s2 = new Student(101,"Jack",20);
		System.out.println("\nDetails of Student 1: ");
		s1.getdata();
		System.out.println("\nDetails of Student 2: ");
		s2.getdata();
	}
}
