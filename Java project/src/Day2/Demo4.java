package Day2;

public class Demo4 {
		static int a=2;
		static int b=3;
		static int c;

public static void main(String[] args) {
	
	System.out.println("Simple Assignment Operator "+(c=a+b));
	System.out.println("Add AND Assignment Operator "+(c+=a));
	System.out.println("Subtract AND assignment operator "+(c-=a));
	System.out.println("Multiply AND assignment operator "+(c*=a));
	System.out.println("Divide AND assignment operator "+(c/=a));
	System.out.println("Modulus AND assignment operator "+(c%=a));
	System.out.println("Left shift AND assignment operator "+(c<<=2));
	System.out.println("Right shift AND assignment operator "+(c>>=2));
	System.out.println("Bitwise AND assignment operator "+(c&=2));
	System.out.println("bitwise exclusive OR and assignment operator "+(c^=2));
	System.out.println("bitwise inclusive OR and assignment operator "+(c|=2));
	
  }
}


	