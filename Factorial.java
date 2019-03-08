//Program to show implementation of for loop and while loop to find the factorial of a number.
//Both methods factorial_for() and factorial_while() returns the factorial of number passed to it
class factorial_meth
{	long factorial_for(int n)
	{	long f=1;
		int i;
		for(i=1;i<=n;i++)
		{	f=f*i;	//or use f*=i
			//braces can be avoided since the block of code contains only one statement
			}
		return f;
	}
	long factorial_while(int n)
	{	long f=1;
		while(n>0)
		{	f=f*n;
			n--;
			}
		return f;	
	}
}
public class Factorial
{	public static void main(String args[])
	{	factorial_meth fact = new factorial_meth();
		System.out.println("Factorial of 10 (using for loop): "+fact.factorial_for(10));
		System.out.println("Factorial of 10 (using while loop): "+fact.factorial_while(10));
	}
}
