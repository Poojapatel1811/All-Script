package Day1;

class x{

protected  int i = 12;
	void print()
	{
		System.out.println("Print i value "+i);
	}
	//create method here and print i value
}
public class MainClass 
{
	public static void main(String[] args)
	{
		//call method here and again print i value here
		x a=new x();
		a.print();
		System.out.println("Print i value "+a.i);
		
	}	
}  