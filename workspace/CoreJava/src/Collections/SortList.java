package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Employee
{
	public Employee(String name, int rollNo, int sal) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.sal = sal;
	}
	String name;
	int rollNo;
	int sal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return name + "    " + rollNo;
	}
	

}

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/////////////// Sort the Integer in list//////////////////////
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(345);
		lst.add(432);
		lst.add(222);
		lst.add(100);
		Collections.sort(lst, new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {
				// TODO Auto-generated method stub
				return num2 - num1;
			}

		});

		for (Integer num : lst) {
			System.out.println(num);
		}
		////////////////// Sort the String//////////////////////
		List<String> lst1 = new ArrayList<String>();
		lst1.add("mama");
		lst1.add("gelu");
		lst1.add("hero");
		lst1.add("mamamamm");
		Collections.sort(lst1, new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				// TODO Auto-generated method stub
				return str1.compareTo(str2);
			}

		});

		for (String str : lst1) {
			System.out.println(str);
		}


		List<Employee> lstObject =  new ArrayList<Employee>();
		lstObject.add(new Employee("jini",4,5000));
		lstObject.add(new Employee("mama",1,1000));
		lstObject.add(new Employee("papaun",5,7000));
		lstObject.add(new Employee("gelu",8,5000));
		///////////Name Comparator//////////////////////////////
		Collections.sort(lstObject,new Comparator<Employee>(){

			@Override
			public int compare(Employee obj1, Employee obj2) {
				// TODO Auto-generated method stub
				return obj1.getName().compareTo(obj2.getName());
			}
			
		});
		
		for(Employee e:lstObject)
		{
			System.out.println(e);
		}
		/////////////////////rollNO comparator////////////////////////
		
		Collections.sort(lstObject, new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getRollNo()-o2.getRollNo();
			}
			
		});
		for(Employee e:lstObject)
		{
			System.out.println(e);
		}
		
	}
	///////////////////////// Sort the Object////////////////////
	
	
	
	

}
