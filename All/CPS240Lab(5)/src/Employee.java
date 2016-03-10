import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


public class Employee implements Comparator {

		
	String name;
	int Salary;
	
	public Employee(String name, int salary){
		this.name=name;
		this.Salary=Salary;
	}

	
	Employee emp1 = new Employee("Mark", 6);
	Employee emp2 = new Employee("Jesse", 7);
	Employee emp3 = new Employee("David", 89);





	public int compare(Object o1, Object o2) {
		
		LinkedList <Employee> list = new LinkedList();
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		int num;
		
		Employee o3 = (Employee) o1;
		Employee o4 = (Employee) o2;
		
			if(o3.getSalary()> o4.getSalary()){
				num = 1;
			} else if(o3.getSalary()== o4.getSalary()){
				num = 0;
			}else{
				num = -1;
			}
			return num;
			
	}



	public String getName() {
		return name;
	}



	public void setName(String name)   {this.name = name;}
	public int getSalary()            {return Salary;}
	public void setSalary(int salary) {Salary = salary;}





}
