//Non-static method Program for add,sub,mul,div,mod
package assignments;
public class Assignment3 
{
	void add()
	{
		System.out.println("Add called");
	}
	void sub()
	{
		System.out.println("Sub called");
	}
	void mul()
	{
		System.out.println("mul called");
	}
	void div()
	{
		System.out.println("div called");
	}
	void mod()
	{
		System.out.println();
	}
	public static void main(String[] args)
	{
		Assignment3 a1= new Assignment3();
		a1.add();
		a1.sub();
	}

}
