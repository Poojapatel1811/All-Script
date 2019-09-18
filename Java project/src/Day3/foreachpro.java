package Day3;

public class foreachpro {


	public static void main(String[] args) {
		int[] a={3,4,5,-5,0,12};
		int sum=0;
		for(int n:a)
		{
			sum=sum+n;
		}
		System.out.println("Sum of an integer arrays: "+sum);
		

	}

}
