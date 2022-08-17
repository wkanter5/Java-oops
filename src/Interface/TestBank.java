package Interface;

public class TestBank  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(UsBank.min_bal);
		HSBCBank hs = new HSBCBank();
		hs.carLoan();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		
		//dynamic polymorphism: child class object can be referred by parent interface var
		//only overridden methods can be referred 
		
		UsBank b  = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
				
	}

}
