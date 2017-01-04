
public class EmployeeTest {
	public static void main(String[] args)
	{
		Employee emp1 = new Employee("Joe", "Schmoe", 1000);
		Employee emp2 = new Employee("Elle", "Witter", 5000);
		System.out.printf("%s %s made $%f dollars this year, and %s %s made $%f. \n", emp1.GetFirstName(), emp1.GetLastName(), emp1.GetMonthlySalary()*12, emp2.GetFirstName(), emp2.GetLastName(), emp2.GetMonthlySalary()*12);
		double emp2NewSalary = emp2.GetMonthlySalary()*1.1;
		double emp1NewSalary = emp1.GetMonthlySalary()*1.1;
		emp1.SetMonthlySalary(emp1NewSalary);
		emp2.SetMonthlySalary(emp2NewSalary);
		System.out.printf("After giving both employees a 10 percent raise, ");
		System.out.printf("%s %s made $%f dollars this year, and %s %s made $%f", emp1.GetFirstName(), emp1.GetLastName(), emp1.GetMonthlySalary()*12, emp2.GetFirstName(), emp2.GetLastName(), emp2.GetMonthlySalary()*12);		
	}
}


