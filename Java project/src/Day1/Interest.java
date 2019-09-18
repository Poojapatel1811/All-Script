package Day1;

public class Interest {
	float P=500;
	float R=10;
	float T=2;
	void SI()
	{
		float SI=(P*R*T)/100;
		System.out.println(SI);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Interest I=new Interest();
		 I.SI();
	}

}