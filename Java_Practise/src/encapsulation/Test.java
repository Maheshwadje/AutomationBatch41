package encapsulation;

class Amazon
{
	private String un = "contact@grotechminds.com";//value updated to mahesh.wadje@gmail.com
	
	public String getUn()
	{
		return un;
	}
	public void setUn(String un)
	{
		this.un = un;
	}
}
public class Test 
{

	public static void main(String[] args) 
	{
		Amazon a1 = new Amazon();
		a1.setUn("mahesh.wadje@gmail.com");
		System.out.println(a1.getUn());
	}

}
