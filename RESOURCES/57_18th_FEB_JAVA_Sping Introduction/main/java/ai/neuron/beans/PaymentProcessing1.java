package ai.neuron.beans;

public class PaymentProcessing1 
{
	private IPay cardPayment=null;
	
	public PaymentProcessing1(IPay cardPayment)
	{
		this.cardPayment=cardPayment;
		
	}
	public void setCardPayment(IPay cardPayment)
	{
		this.cardPayment=cardPayment;
	}
	
	
	public boolean doPayment(String cardType, Double billAmount)
	{
		return cardPayment.payTheBill(billAmount);
		
	}
	}


