package Collections;

class Parent
{
	public void parentMtd()
	{
		System.out.println("Parent class called");
	}
}

class Child extends Parent
{
	public void parentMtd()
	{
		System.out.println("ParentChild class called");
	}
	public void childMtd()
	{
		System.out.println("Child class called");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		Parent p =  new Parent();
		p.parentMtd();
		System.out.println("////////////Child class object got created/////////////////////");
		Child ch =  new Child();
		ch.parentMtd();
		ch.childMtd();
		System.out.println("/////////////even though we r created child class object but we are assigning to parent so only parent method will be available/////////////");
		
		Parent parentChild = new Child();
		parentChild.parentMtd();
		
		
				
				

	}

}
