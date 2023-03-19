package ai.neuron.beans;

public class AmexPayment implements IPay
{
	public boolean payTheBill(Double billAmount)
	{
		System.out.println("Paying Bill Using ACP "+ billAmount);
		return true;
	}
}
