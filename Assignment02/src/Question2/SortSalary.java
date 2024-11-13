package Question2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortSalary {
	
	public static void insertionSort(Employee[] employees, int n) {
		
			for (int i = 1; i < n; i++) {
	            Employee key = employees[i];
	            int j = i - 1;
                     
	          
	            while (j >= 0 && employees[j].salary > key.salary) {
	                employees[j + 1] = employees[j];
	                j--;
	            }
	            employees[j + 1] = key;
	        }
	    }
	
		public static void main(String[] args) {
			Employee[] employees = {
		            new Employee("Vivek", 55000),
		            new Employee("Siddhesh", 40000),
		            new Employee("Ajay", 75000),
		            new Employee("Jayesh", 50000)
		        };

			System.out.println("Array before sort : " + Arrays.toString(employees));

			insertionSort(employees, employees.length);
			
			System.out.println("Array after sort : " + Arrays.toString(employees));

	

}
}
