package typecasting;

public class Ass2 {
	public static void main(String[] args)
	{
		long mylong = 1000;
		byte b = (byte) mylong;
		b = (byte) 1000;
		System.out.println(b);
		System.out.println(mylong);
		
	}
}
