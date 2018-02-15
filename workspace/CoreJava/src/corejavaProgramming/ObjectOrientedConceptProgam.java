package corejavaProgramming;
class A
{
	protected void get()
	{
		System.out.println("Class A is parent class");
	}
}
class B extends A
{	@override
	public void get1()
	{	super.get();
		System.out.println("Class B is parent class");
	}
}


public class ObjectOrientedConceptProgam {

	public static void main(String[] args) {
		B b =  new B();
		b.get1();

	}

}
