package Day6;
class student1

{

	float Total;
 public void total_marks(int a,int b,int c,int d,int e,int f)
	{
		Total=a+b+c+d+e+f;
		
		System.out.println("Total marks with 6 arguments:"+Total);
		
	}
	public void total_marks(int a,int b,int c,int d,int e,int f,int g)
	{
		Total=a+b+c+d+e+f+g;
		System.out.println("total mark with 7 arguments:"+Total);
	}
}
public class StudentOverloading {

	public static void main(String[] args) {
		student1 s=new student1();
		
		s.total_marks(10, 15, 12, 16, 25, 30);
		s.total_marks(10, 20, 15, 25, 30, 5, 12);
	}

}
