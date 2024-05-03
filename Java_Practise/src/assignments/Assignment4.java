//Program to write both static and non-static method  in a class
package assignments;
public class Assignment4 
{
	static void login()
	{
		System.out.println("login called");
	}
	 void payment()
	{
		 System.out.println("payment called");
	}
	public static void main(String[] args) 
	{
		Assignment4 a1 = new Assignment4();
		login();
		a1.payment();

	}

}
