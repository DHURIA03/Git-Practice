package packageA;

public class ClassOne 
{
	String defaultVar = "I am default variable, you can access me in same package only";
	public String publicVar = "I am public variable, You can access me in Any package in same java project";
	private String privateVar = "I am private variable, You can access me in same class only";
	protected String protectedVar = "I am protected variable, You can access me in same package as well different package in only subclasses";
	
	public static void main(String[] args) 
	{
		ClassOne object1 = new ClassOne();
		System.out.println(object1.defaultVar);
		System.out.println(object1.publicVar);
		System.out.println(object1.privateVar);
		System.out.println(object1.protectedVar);
	}

}
