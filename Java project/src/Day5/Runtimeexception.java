package Day5;


public class Runtimeexception {

	public static void main(String[] args) {
		try
		{
			int i=60/0;
			System.out.println("try block");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
