
class Employee
{
	String FirstName;
	String LastName;
	double MonthlySalary;
	
	public Employee(String FN, String LN, double S)
	{
		FirstName = FN;
		LastName = LN;
		if (S>0)
			MonthlySalary = S;
		else
			MonthlySalary = 0;
	}
	
	public void SetFirstName(String FN)
	{
		FirstName = FN;
	}
	
	public void SetLastName(String LN)
	{
		LastName = LN;
	}
	
	public void SetMonthlySalary(double S)
	{
		if (S > 0)
			MonthlySalary=S;
	}
	
	public String GetFirstName()
	{
		return FirstName;
	}
	
	public String GetLastName()
	{
		return LastName;
	}
	
	public double GetMonthlySalary()
	{
		return MonthlySalary;
	}
}
