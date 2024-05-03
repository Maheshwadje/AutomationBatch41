package concept;
//it is used to skip any particular iteration
public class ContinueKeyword {

	public static void main(String[] args)
	{
		for(int i = 0; i<=8 ; i++)
		{
			if(i==6)
			{
				continue;
			}
			System.out.println("My age is " +i);
		}

	}

}
