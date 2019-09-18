package Day5;

public class StringOutofBoundEx {

	public static void main(String[] args) {
		try
		{
			String s="Hello,Welcome to 1Rivet";
			char c=s.charAt(25);
			System.out.println(c);
		}

		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException");
		}
	}
}

