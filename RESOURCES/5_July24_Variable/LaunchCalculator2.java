class Calculator2
{
	int a;
	int b;
	void add(int a, int b)
	{
		
		int c=a+b;
		System.out.println(c);
	}

}
public class LaunchCalculator2 {

	public static void main(String[] args) {
		
		Calculator2 calc=new Calculator2();
	    calc.add(10,20);
		
	}

}

