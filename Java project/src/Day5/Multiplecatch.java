package Day5;


public class Multiplecatch {

	public static void main(String[] args) {
		try
		{
			
			int arr[]={1,5,9,8};
			int i;
			System.out.println(arr[10]);
			i=80/0;
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}


}
