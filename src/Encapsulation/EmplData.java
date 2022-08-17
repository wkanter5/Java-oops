package Encapsulation;

public class EmplData {
	
	
	//how to implement encapsulation: first make instance variable private data variable so that vars can not be 
	//accessed from the outside
	//getter and setter methods:
	// to set and get values of the fields
	private int ssn;
	private String empName;
	private int empAge;
	//getter and setter methods 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmplData emp = new EmplData();
		emp.setEmpName("sagar basnet");
		emp.setEmpAge(30);
		emp.setSsn(999888888);
		
		System.out.println("Emplyee name is: "+emp.getEmpName());
		System.out.println("Employee age is: "+ emp.getEmpAge());
		System.out.println("Employee SSN is: "+emp.getSsn());
	}

	//getter and setter methods

	public int getSsn() {
		return ssn;
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;
		//this key word is used to refer class variable 
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
