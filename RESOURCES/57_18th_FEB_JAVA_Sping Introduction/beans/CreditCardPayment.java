package ai.neuron.beans;

public class CreditCardPayment implements IPay 
{
	public boolean payTheBill(Double billAmount)
	{
		System.out.println("Paying Bill Using Credit Card P "+ billAmount);
		//logic to check the amount remaining card --balance
		return true;
	}

}
