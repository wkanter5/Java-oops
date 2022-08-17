package Interface;

public class HSBCBank implements UsBank,BrazilBank{

	//If a class is implementing any interface, it is mandatory to define/override all the methods of interface
	//we are achieving multiple inheritance
	//Is a relationship 
	
	public void credit () {
		System.out.println("hsbc--credit");
	}

	public void debit() {
		System.out.println("hsbc--debit");
	}

	public void transferMoney() {
		System.out.println("hsbc--transfer money");

	}
	
	//BrazilBank 
	public void mutualFund() {
		System.out.println("hsbc-- mutual fund");
	}

	public void houseLoan() {
		System.out.println("hsbc--house loan");
	}
	//Hsbc Bank
	public void educationLoan() {
		System.out.println("hsbc--education loan");

	}
	public void carLoan() {

		System.out.println("hsbc--car loan");
	}

}
