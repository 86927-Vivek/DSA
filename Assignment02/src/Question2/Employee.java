package Question2;

public class Employee {
	 String name;
	    double salary;

	    public Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return "Employee{name='" + name + "', salary=" + salary + "}";
	    }
	}



