package Day5;

public class finallyblock {

	public static void main(String[] args) {
			try
			{
				String s=null;
				System.out.println("Try block is executed"+s.length());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("Finally block is executed");
			}

	}

}
