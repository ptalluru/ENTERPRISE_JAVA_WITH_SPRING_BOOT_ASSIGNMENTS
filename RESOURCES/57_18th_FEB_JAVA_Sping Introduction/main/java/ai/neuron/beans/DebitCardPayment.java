package ai.neuron.beans;

public class DebitCardPayment implements IPay
{
	public boolean payTheBill(Double billAmount)
	{
		System.out.println("Paying Bill Using debit card payment "+ billAmount);
		return true;
	}

}
