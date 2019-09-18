package Day6;

class Student {
	float total,perc;
	public void Total_marks(int a,int b,int c)
	{
		total=a+b+c;
		System.out.println("Total marks is: "+total);
	}
	
}
class Marks extends Student
{	

	public float Percentage()
	{
		perc=(total/300)*100;
		return perc;
	}
}	

public class Studentresults
{
	public static void main(String[] args) {
	Marks m = new Marks();
	m.Total_marks(85,96,59);
	float result=m.Percentage();
	System.out.println("Percentage is: "+result);
		
}
}
