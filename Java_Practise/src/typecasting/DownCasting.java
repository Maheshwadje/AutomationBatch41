package typecasting;
//no practical use, we can do downcasting once upcasting is done.
//converting parent class object to superclass type is called downcasting
class ParentclassOne
{
	
}
public class DownCasting extends ParentclassOne
{


	public static void main(String[] args) 
	{
		ParentclassOne pa = new DownCasting(); //upcasting
		
		DownCasting d1 = (DownCasting) pa; //downcasting
		
	}

}
