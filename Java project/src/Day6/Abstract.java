package Day6;

abstract class Abc
{
	abstract void run();
}
class Car extends Abc
{
	void run()
	{
		System.out.println("This is a car");
	}
}

public class Abstract {

	public static void main(String[] args) {
		 Abc c=new Car();
		 c.run();	
	}

}
