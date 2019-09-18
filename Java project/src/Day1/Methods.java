package Day1;



public class Methods {
	

	public int add(int a,int b)
	{
		int c= a+b;
		System.out.println(c);
		return c;
		
	
	}
	
	public void display (int a,int b)
	{
		int c = a+b;
		System.out.println("This is non return function " + c);
	
	}
	
	public static void main(String[] args) {
	
		Methods m=new Methods();
		m.add(10,20);
		m.display(10,25);
		
	}
}
