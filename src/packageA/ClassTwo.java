package packageA; 

public class ClassTwo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ClassOne object2 = new ClassOne();
		System.out.println(object2.defaultVar);
		System.out.println(object2.publicVar);
		//System.out.println(object2.privateVar); // this is private class so it is not accessible in another class without getter setter
		System.out.println(object2.protectedVar);
		

	}

}
