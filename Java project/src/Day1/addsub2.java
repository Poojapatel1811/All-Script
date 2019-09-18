package Day1;

public class addsub2{
	
	int a=100;
	int b=50;
	void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	void sub()
	{
		int d=a-b;
		System.out.println(d);
	}
	void mul()
	{
		int e=a*b;
		System.out.println(e);
	}
	void div()
	{
		int f=a/b;
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addsub2 o=new addsub2();
		o.add();
		o.sub();
		o.mul();
		o.div();

	}

}