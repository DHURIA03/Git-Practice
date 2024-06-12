package packageB;

import packageA.ClassOne;

public class ClassThree extends ClassOne{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ClassOne object3 = new ClassOne();
		//System.out.println(object3.defaultVar); //So hear we are trying to call default varible in different pacake but its not calling
		System.out.println(object3.publicVar);
		//System.out.println(object3.privateVar); // this is private variable so it is not accessible in another package without getter setter
		//System.out.println(object3.protectedVar); // we cant access protected in different package without subclass
		
		ClassThree object1 = new ClassThree();
		System.out.println(object1.publicVar);
		System.out.println(object1.protectedVar);
		

	}

}
