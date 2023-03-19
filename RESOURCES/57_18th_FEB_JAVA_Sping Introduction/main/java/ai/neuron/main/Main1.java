package ai.neuron.main;

import ai.neuron.beans.*;
import ai.neuron.beans.PaymentProcessing1;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Constructor Injection
		PaymentProcessing1 pp=new PaymentProcessing1(new CreditCardPayment());
		
		//dependency injection --> Injecting dependent object into target object
		//
		
		//SetterInjection
		//injecting dependent object into the target object
		//using target class setter --> setter injection
		pp.setCardPayment(new DebitCardPayment());
		
		boolean status=pp.doPayment("Debit", 100.0);
		
		if(status)
		{
			System.out.println("Payment success!");
		}
		else
		{
			System.out.println("Failed payment ");
		}
		
		//creating target class object and dependent class object and
		//injecting dependent object into target class is not just one peoj requiremtn
		// it is a universal requirement
		
		//IOC -->principle --> responsible --> manage and Collaborate
		// -- dependencies among the objects in the application

	}

}
