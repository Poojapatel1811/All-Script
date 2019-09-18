package Day4;

public class duplicateremove {

	public static void main(String[] args) {
		int a[]={5,2,2,5,7,4};
		int j;
		for(int i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
			if(a[i]!=a[j])
			{
				System.out.println("Duplicate values:"+a[i]);
				
			}
		}
		}
	}

}
