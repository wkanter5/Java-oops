package oops;

public class Testcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bmw b = new Bmw();
		b.start();
		b.stop();
		b.refule();
		b.threftSafe();
		
		
		
		System.out.println("**************");
	
		//top casting or dynamic polymorphism or runtime polymorphism 
		Car c = new Car();
		c.start();
		c.start();
		c.refule();
		
		System.out.println("**************");

		Car c1 = new Bmw();
		c1.start();
		c1.stop();
		c1.refule();
	}

}
