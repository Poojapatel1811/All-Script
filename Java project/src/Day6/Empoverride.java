package Day6;

class Employee
{
	float day;
	float pay;
	float basicpay;
	public void basic_pay(float day,float pay)
	{ 
		basicpay=day*pay;
		System.out.println("Employess basic pay "+basicpay);
	}
	}
class Department extends Employee
{
	public void basic_pay(float day,float pay)
	{
		basicpay=day*pay;
		System.out.println("Department basic pay "+basicpay);
	}
}

public class Empoverride {
	
	public static void main(String[] args) {
		Employee e=new Department();
		e.basic_pay(30,10000);	

	}

}
