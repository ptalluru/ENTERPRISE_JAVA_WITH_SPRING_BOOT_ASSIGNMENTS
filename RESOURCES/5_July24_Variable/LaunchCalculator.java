
class Calculator
{
	int add()
	{
		
		int c=10+20;
		
		return c;	
	
	}

}


public class LaunchCalculator {

	public static void main(String[] args) {
		
		Calculator calc=new Calculator();
		int result=calc.add();
		System.out.println(result);

	}

}
